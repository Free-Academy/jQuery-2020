package com.foo.jquery.chapter2.servlet;

import com.alibaba.fastjson.JSON;
import com.foo.jquery.chapter2.vo.Product;
import com.foo.jquery.chapter2.vo.RespBody;
import com.foo.jquery.chapter2.vo.Specs;
import com.foo.jquery.chapter2.vo.Supplier;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product/list.do")
public class ProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        RespBody respBody = new RespBody();
        List<Product> productList = new ArrayList<>(10);
        for (int i = 1; i <= 5; i++) {
            Product product = new Product();
            product.setProductName("商品名称" + i);
            Supplier supplier = new Supplier();
            supplier.setId(100);
            supplier.setSuppName("浪潮集团");
            product.setSupplier(supplier);
            Specs specs = new Specs();
            specs.setSpecName("内存");
            specs.setSpecAttr(new String[]{"16G","32G","128G","256G"});
            product.setSpecs(specs);
            productList.add(product);
        }
        respBody.setData(productList);
        String respJSON = JSON.toJSONString(respBody);
        response.getWriter().write(respJSON);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
