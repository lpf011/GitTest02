package com.msb.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/FM01")
public class FMakerServlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name","hello");

        String [] arr= new String[]{"aasd","csdsd","ddsd","bdsd"};
        req.setAttribute("arr1",arr);

        Map<String,String> hash=new HashMap<>();
        hash.put("lili","ll");
        hash.put("huahua","huah");
        hash.put("titi","tt");
        hash.put("sisi","ss");
        req.setAttribute("hash",hash);

        req.getRequestDispatcher("fm.ftl").forward(req,resp);



    }
}
