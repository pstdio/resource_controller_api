package eu.pstdio.resource_controller_api.integration.entity;

/**
 *
 * @author mib
 */
public interface LoginEntity {
    void setId(Long id);
    Long getId();
    void setDisabled(boolean disabled);
    boolean isDisabled();
}
