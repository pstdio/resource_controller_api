package eu.pstdio.resource_controller_api.business.message;

/**
 *
 * @author mib
 */
public interface InputMessage {
    void setLoginId(String loginId);
    String geLoginId();
    void setResourceUuid();
    String getResourceUuid();
}
