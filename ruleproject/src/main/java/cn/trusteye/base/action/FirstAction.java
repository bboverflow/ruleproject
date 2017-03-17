package cn.trusteye.base.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstAction {

	//管理页
	@RequestMapping("/admin")
	public String admin(Model model)throws Exception {

		return "/admin/first";
	}

	//F2业务页
	@RequestMapping("/f2")
	public String f2(Model model)throws Exception {

		return "/f2/first";
	}

	//欢迎页面
	@RequestMapping("/welcome")
	public String welcome(){
		
		return "/base/welcome";
	}
}
