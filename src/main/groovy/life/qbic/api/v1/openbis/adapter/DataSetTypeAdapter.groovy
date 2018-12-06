package life.qbic.api.v1.openbis.adapter

interface DataSetTypeAdapter {

    String getCode()

    String getDescription()

    DataSetTypeFetchOptionsAdapter getFetchOptions()

    String getMainDataSetPath()

    Date getModificationDate()

    EntityTypePermIdAdapter getPermId()

    List<PropertyAssignmentAdapter> getPropertyAssignments()

    PluginAdapter getValidationPlugins()

    boolean isDisallowDeletion()


}