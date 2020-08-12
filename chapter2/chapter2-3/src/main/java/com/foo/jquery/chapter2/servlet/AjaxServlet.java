package com.foo.jquery.chapter2.servlet;

import com.alibaba.fastjson.JSON;
import com.foo.jquery.chapter2.vo.RespBody;
import com.foo.jquery.chapter2.vo.User;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/ajax/test.do")
public class AjaxServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        String params = request.getParameter("data");
        User user = new User();
        user.setId(1);
        user.setUserName("547317812@qq.com");
        user.setPassword("123456");
        user.setNickName("哪吒");
        user.setEmployer("天庭");
        user.setPosition("中坛元帅");
        RespBody respBody = new RespBody();
        respBody.setCode(0);
        respBody.setMsg("请求成功");
        respBody.setData(user);
        String respJSON = JSON.toJSONString(respBody);
        response.getWriter().write(respJSON);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
