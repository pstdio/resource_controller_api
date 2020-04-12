package eu.pstdio.resource_controller_api.integration.entity;

import java.util.Set;

/**
 *
 * @author mib
 */
public interface ResourceEntity {
    void setUuid(String uuid);
    String getUuid();
    void setUrl(String url);
    String getUrl();
    void setRolesEntities(Set rolesEntities);
    Set getRolesEntities();
    void setDisabled(boolean disabled);
    boolean isDisabled();
    void setSecured(boolean Secured);
    boolean isSecured();
}
