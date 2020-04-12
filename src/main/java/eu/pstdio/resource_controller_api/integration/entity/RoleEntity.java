package eu.pstdio.resource_controller_api.integration.entity;

import java.util.Set;

/**
 *
 * @author mib
 */
public interface RoleEntity {
    void setId(Long id);
    Long getId();
    void setName(String name);
    String getName();
    void setLoginsIds(Set<Long> loginsIds);
    Set<Long> getLoginsIds();
    void setResourcesEntities(Set resourcesEntities);
    Set getResourcesEntities();
    void setDisabled(boolean disabled);
    boolean isDisabled();
}
