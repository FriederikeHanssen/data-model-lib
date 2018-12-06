package life.qbic.api.v1.openbis.adapter

interface SampleTypeFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    SampleTypeSortOptionsAdapter getSortBy()

    boolean hasPropertyAssignments()

    boolean hasSemanticAnnotations()

    boolean hasValidationPlugin()

    SampleTypeSortOptionsAdapter sortBy()

    PropertyAssignmentFetchOptionsAdapter withPropertyAssignments()

    PropertyAssignmentFetchOptionsAdapter withPropertyAssignmentsUsing(Object fetchOptions)

    SemanticAnnotationFetchOptionsAdapter withSemanticAnnotations()

    SemanticAnnotationFetchOptionsAdapter withSemanticAnnotationsUsing(Object fetchOptions)

    PluginFetchOptionsAdapter withValidationPlugin()

    PluginFetchOptionsAdapter withValidationPluginUsing(Object fetchOptions)
}
