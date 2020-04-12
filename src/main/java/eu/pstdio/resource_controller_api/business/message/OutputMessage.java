package eu.pstdio.resource_controller_api.business.message;

/**
 *
 * @author mib
 */
public interface OutputMessage {
    void setPrivileged(boolean privileged);
    boolean isPrivileged();
    void setResourceUrl(String resourceUrl);
    String getResourceUrl();
}
