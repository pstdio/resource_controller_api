package eu.pstdio.resource_controller_api.integration.dao;

import java.util.List;

/**
 *
 * @author mib
 */
public interface RoleDao {
    List getByIdAndLoginId(Long id, Long loginId);
    List getByLoginIdAndResourceUuid(Long loginId, String resourceUuid);
}
