package goit.hw.servlet;

import goit.hw.time.TimeManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/time")
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String timeZone = req.getParameter("timezone");
        if (timeZone == null) timeZone = "UTC";

        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().write(TimeManager.getDateTime(timeZone));
        resp.getWriter().close();
    }
}
