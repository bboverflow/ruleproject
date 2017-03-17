package cn.trusteye.base.action;

import cn.trusteye.base.pojo.po.SysRole;
import cn.trusteye.base.pojo.pocustom.SysRoleCustom;
import cn.trusteye.base.pojo.pocustom.SysUserCustom;
import cn.trusteye.base.pojo.vo.RoleQueryVo;
import cn.trusteye.base.pojo.vo.UserQueryVo;
import cn.trusteye.base.result.DataGridResultInfo;
import cn.trusteye.base.service.UserService;
import cn.trusteye.base.util.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    Map<String,Object> addusersubmit(UserQueryVo userQueryVo) throws Exception{

        int type = 0;//成功
        String message = "成功";

        try {
            userService.insertUser(userQueryVo.getUserCustom());
        } catch (Exception e) {
            type=1;
            message = e.getMessage();
        }

        Map<String,Object> result_map = new HashMap<String,Object>();
        result_map.put("type",type);
        result_map.put("message",message);

        return result_map;
    }
}
