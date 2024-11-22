package filter;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "EncodeFilter",urlPatterns = "/*")
public class EncoderFilter implements Filter {
    public void destroy(){}
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        chain.doFilter(req, res);
    }

    public void init(FilterConfig config) throws ServletException {}
}
