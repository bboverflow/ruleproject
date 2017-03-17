package cn.trusteye.f2.action;

import cn.trusteye.base.result.DataGridResultInfo;
import cn.trusteye.base.util.PageQuery;
import cn.trusteye.f2.pojo.pocustom.F2sesnkeySetCustom;
import cn.trusteye.f2.pojo.vo.F2sessionQueryVo;
import cn.trusteye.f2.service.F2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Rayman on 2017/3/14.
 */
@Controller
@RequestMapping("/f2")
public class F2Controller {
    @Autowired
    F2Service f2Service;


    @RequestMapping("/querySession")
    public String queryuser(Model model)throws Exception{

        return "f2/querysession";
    }

    //最终DataGridResultInfo通过@ResponseBody将java对象转成json
    @RequestMapping("/queryPageSession")
    public
    @ResponseBody
    DataGridResultInfo querySession(
            F2sessionQueryVo f2sessionQueryVo,
            int page,//页码
            int rows//每页显示个数
    ) throws Exception {

        //非空校验
        f2sessionQueryVo = f2sessionQueryVo != null ? f2sessionQueryVo : new F2sessionQueryVo();

        //查询列表的总数
        int total = f2Service.findSessionCount(f2sessionQueryVo);

        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageParams(total, rows, page);

        //分页查询，向sysuserQueryVo中传入pageQuery
        f2sessionQueryVo.setPageQuery(pageQuery);

        List<F2sesnkeySetCustom> list = f2Service.findSessionList(f2sessionQueryVo);

        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //填充 total
        dataGridResultInfo.setTotal(total);
        //填充  rows
        dataGridResultInfo.setRows(list);

        return dataGridResultInfo;
    }




}
