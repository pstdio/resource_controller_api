package eu.pstdio.resource_controller_api.integration.dao;

import eu.pstdio.resource_controller_api.integration.entity.ResourceEntity;

/**
 *
 * @author mib
 */
public interface ResourceDao {
    ResourceEntity getByUuid(String uuid);
}
