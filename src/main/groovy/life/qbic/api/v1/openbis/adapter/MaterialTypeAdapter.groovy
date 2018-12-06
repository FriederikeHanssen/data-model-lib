package life.qbic.api.v1.openbis.adapter

interface MaterialTypeAdapter {

    String getCode()

    String getDescription()

    MaterialTypeFetchOptionsAdapter getFetchOptions()

    Date getModificationDate()

    EntityTypePermIdAdapter getPermId()

    List<PropertyAssignmentAdapter> getPropertyAssignments()

    PluginAdapter getValidationPlugin()
}
