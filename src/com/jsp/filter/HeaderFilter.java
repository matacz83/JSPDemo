package com.jsp.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "HeaderFilter", servletNames = {"HelloServlet"})
public class HeaderFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println(((HttpServletRequest) req).getHeader("host"));
        //chain.doFilter(req, resp);
        ((HttpServletResponse) resp).sendError(403);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}