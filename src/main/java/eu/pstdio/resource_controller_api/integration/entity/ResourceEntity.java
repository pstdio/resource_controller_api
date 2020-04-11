package eu.pstdio.resource_controller_api.integration.entity;

import java.util.List;

/**
 *
 * @author mib
 */
public interface ResourceEntity {
    void setUuid(String uuid);
    String getUuid();
    void setUrl(String url);
    String getUrl();
    void setRolesEntities(List<RoleEntity> rolesEntites);
    List<RoleEntity> getRolesEntities();
    void setDisabled(boolean disabled);
    boolean getDisabled();
}
