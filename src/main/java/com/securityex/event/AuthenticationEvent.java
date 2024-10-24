package com.securityex.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuthenticationEvent {

    @EventListener
    public void onSuccess(AuthenticationSuccessEvent success) {
        log.info("로그인 성공, username : {}", success.getAuthentication().getName());
    }

    @EventListener
    public void onFailure(AbstractAuthenticationFailureEvent failures) {
        log.error("{} 때문에 로그인 실패, username : {}", failures.getException().getMessage(), failures.getAuthentication().getName());
    }
}
