package eu.pstdio.resource_controller_api.integration.dao;

import eu.pstdio.resource_controller_api.integration.entity.RoleEntity;

/**
 *
 * @author mib
 */
public interface RoleDao {
    RoleEntity getByIdAndLoginId(Long id, Long loginId);
    RoleEntity getByLoginIdAndResourceUuid(Long loginId, String resourceUuid);
}
