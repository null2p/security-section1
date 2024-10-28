package com.securityex.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authorization.event.AuthorizationDeniedEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuthorizationEvents {
    @EventListener
    public void onFailure(AuthorizationDeniedEvent deniedEvent) {
        log.error("{} 유저의 권한 관련 에러 발생 : {}", deniedEvent.getAuthentication().get().getName(),
                deniedEvent.getAuthorizationDecision().toString());
    }
}
