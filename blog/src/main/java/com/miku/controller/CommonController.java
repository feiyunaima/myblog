package com.miku.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.json.JSONException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.baidu.ueditor.ActionEnter;

@Controller  
@Transactional   
public class CommonController {  
    @RequestMapping("ueditor")  
    public void config(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");  
        String rootPath = request.getSession().getServletContext()  
                .getRealPath("/");  
        try {  
            String exec = new ActionEnter(request, rootPath).exec();  
            PrintWriter writer = response.getWriter();  
            writer.write(exec);  
            writer.flush();  
            writer.close();  
        } catch (IOException | JSONException e) {  
            e.printStackTrace();  
        }  
    }
      
}  

