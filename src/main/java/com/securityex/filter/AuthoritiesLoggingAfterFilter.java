package com.securityex.filter;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;

@Slf4j
public class AuthoritiesLoggingAfterFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null){
            log.info("유저 {}는 성공적으로 인증되었으며 {} 의 권한을 가졌습니다", authentication.getName(), authentication.getAuthorities().toString());
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
