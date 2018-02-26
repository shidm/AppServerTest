package controler;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import pojo.TestEntity;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=utf-8");
        PrintWriter out = resp.getWriter();
        List list = new ArrayList<>();

/*        //多条数据

        for (int i = 0; i < 5; i++) {
            list.add(new User("sdm","22","男","重庆"));
        }
        JSONArray jsonData = JSONArray.fromObject(list);*/


        //单条数据

        JSONObject jsonData = JSONObject.fromObject(new User("sdm","22","男","重庆"));

/*
        //单条数据中包含多条数据

        for (int i = 0; i < 5; i++) {
            list.add(new TestEntity.Content("1", "lalalallala"));
        }
        JSONObject jsonData = JSONObject.fromObject(
                new TestEntity("sdm",
                        "1",
                        new TestEntity.Content("1",
                                "文本"),
                        list));*/

        out.write(jsonData.toString());
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
