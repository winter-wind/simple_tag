package cc.biibi.simpletag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;

//实际开发中只需要继承SimpleTagSupport
public class hellosimpletag implements SimpleTag {

	//jsp标签定义（要在tld文件描述一下）
	private String value;
	private String count;
	public void setValue(String value) {
		this.value = value;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	//标签体逻辑实际应该编写到该方法中。
	@Override
	public void doTag() throws JspException, IOException {
		System.out.println("doTag");
		pageContext.getOut().print("HelloWorld!");//在浏览器输出
		HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
		//获取在浏览器地址上？后面的属性
		pageContext.getOut().print("hello"+request.getParameter("name"));
		System.out.println(value+"::"+count);
		
		JspWriter out = pageContext.getOut();
		int c = 0;
		c=Integer.parseInt(count);
		out.print("<br>");
		for(int i=0; i<c;i++){
			out.print(i+1+":"+"java");
			out.print("<br>");
		}
	}

	@Override
	public JspTag getParent() {
		System.out.println("getParent");
		return null;
	}

	@Override
	public void setJspBody(JspFragment arg0) {
		System.out.println("setJspBody");

	}

	private PageContext pageContext;//声明一个pageContext变量
	//JSP引擎调用，把代表JSP页面的PageContext对象传入
	//PageContext 可以获取jsp页面的其他8个隐含对象
	//所以凡是jsp页面可以做的标签处理器都可以完成
	@Override
	public void setJspContext(JspContext arg0) {
		System.out.println("setJspContext");
		System.out.println(arg0 instanceof PageContext);
		this.pageContext = (PageContext)arg0;//传值
	}

	@Override
	public void setParent(JspTag arg0) {
		System.out.println("setParent");

	}

}
