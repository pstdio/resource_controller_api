package eu.pstdio.resource_controller_api.integration.dao;

import eu.pstdio.resource_controller_api.integration.entity.LoginEntity;

/**
 *
 * @author mib
 */
public interface LoginDao {
    LoginEntity getById(Long id);
}
