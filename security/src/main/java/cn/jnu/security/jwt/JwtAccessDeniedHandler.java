package cn.jnu.security.jwt;

import cn.jnu.common.base.Result;
import cn.jnu.common.base.ResultCode;
import cn.jnu.common.utils.RenderUtil;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * AccessDeniedHandler 权限不足 拒绝访问
 */
@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException e) throws IOException, ServletException {
        RenderUtil.render(response, Result.failure(ResultCode.ACCESS_DENIED));
    }
}
