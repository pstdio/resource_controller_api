package eu.pstdio.resource_controller_api.integration.entity;

import java.util.List;

/**
 *
 * @author mib
 */
public interface RoleEntity {
    void setId(Long id);
    Long getId();
    void setName(String name);
    String getName();
    void setLoginsIds(List<Long> loginsIds);
    List<Long> getLoginsIds();
    void setResourcesEnitties(List<ResourceEntity> resourcesEntites);
    List<ResourceEntity> getResourcesEntities();
    void setDisabled(boolean disabled);
    boolean getDisabled();
}
