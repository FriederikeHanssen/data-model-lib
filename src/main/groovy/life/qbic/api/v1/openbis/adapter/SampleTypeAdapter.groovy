package life.qbic.api.v1.openbis.adapter

interface SampleTypeAdapter {

    String getCode()

    String getDescription()

    SampleTypeFetchOptionsAdapter getFetchOptions()

    String getGeneratedCodePrefix()

    Date getModificationDate()

    EntityTypePermIdAdapter getPermId()

    List<PropertyAssignmentAdapter> getPropertyAssignments()

    List<SemanticAnnotationAdapter> getSemanticAnnotations()

    PluginAdapter getValidationPlugin()

    boolean isAutoGeneratedCode()

    boolean isListable()

    boolean isShowContainer()

    boolean isShowParentMetadata()

    boolean isShowParents()

    boolean isSubcodeUnique()
}