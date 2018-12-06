package life.qbic.api.v1.openbis.adapter

interface ExperimentTypeAdapter {

    String getCode()

    String getDescription()

    ExperimentTypeFetchOptionsAdapter getFetchOptions()

    Date getModificationDate()

    EntityTypePermIdAdapter getPermId()

    List<PropertyAssignmentAdapter> getPropertyAssignments()

    PluginAdapter getValidationPlugin()
}
