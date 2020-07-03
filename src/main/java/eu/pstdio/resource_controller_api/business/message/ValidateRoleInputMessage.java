package eu.pstdio.resource_controller_api.business.message;

/**
 *
 * @author mib
 */
public interface ValidateRoleInputMessage {
    void setLoginId(String loginId);
    String getLoginId();
    void setResourceUuid(String resourceUuid);
    String getResourceUuid();
}
