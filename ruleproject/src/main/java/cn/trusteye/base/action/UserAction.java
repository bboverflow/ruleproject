package cn.trusteye.base.action;

import cn.trusteye.base.pojo.po.SysRole;
import cn.trusteye.base.pojo.pocustom.SysUserCustom;
import cn.trusteye.base.pojo.vo.RoleQueryVo;
import cn.trusteye.base.pojo.vo.UserQueryVo;
import cn.trusteye.base.process.result.DataGridResultInfo;
import cn.trusteye.base.process.result.ResultUtil;
import cn.trusteye.base.process.result.SubmitResultInfo;
import cn.trusteye.base.service.UserService;
import cn.trusteye.base.util.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.trusteye.base.process.context.*;

import java.util.List;

/**
 * Created by Rayman on 2017/3/16.
 */
@Controller
@RequestMapping("/admin")
public class UserAction {

    @Autowired
    UserService userService;


    @RequestMapping("/queryUser")
    public String queryuser(Model model)throws Exception{

        return "admin/queryuser";
    }

    @RequestMapping("/queryUser_result")
    public @ResponseBody
    DataGridResultInfo queryUser(UserQueryVo userQueryVo,int page,int rows) throws Exception{
        userQueryVo = userQueryVo != null ? userQueryVo:new UserQueryVo();
        //查询用户总数
        int total = userService.findUserCount(userQueryVo);

        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageParams(total, rows, page);
        userQueryVo.setPageQuery(pageQuery);

        //查询用户
        List<SysUserCustom> list = userService.findUserList(userQueryVo);
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        dataGridResultInfo.setTotal(total);
        dataGridResultInfo.setRows(list);

        return dataGridResultInfo;
    }

    //进入用户添加页面
    @RequestMapping("/adduser")
    public String adduser(Model model) throws Exception{
        RoleQueryVo roleQueryVo = new RoleQueryVo();
        List<SysRole> roleList = userService.findRoleList(roleQueryVo);
        model.addAttribute("roleList",roleList);
        return "/admin/adduser";
    }

    //提交用户添加请求
    //提交结果转json输出到页面
    @RequestMapping("/addusersubmit")
    public @ResponseBody
    SubmitResultInfo addusersubmit(UserQueryVo userQueryVo) throws Exception{

/*
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
        resultInfo.setMessage("操作成功");
*/

        userService.insertUser(userQueryVo.getUserCustom());

//        return new SubmitResultInfo(resultInfo);

        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Configure.MESSAGE, 906, null));
    }
}
