package life.qbic.api.v1.openbis.adapter

interface MaterialTypeFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    MaterialTypeSortOptionsAdapter getSortBy()

    boolean hasPropertyAssignments()

    boolean hasValidationPlugin()

    MaterialTypeSortOptionsAdapter sortBy()

    PropertyAssignmentFetchOptionsAdapter withPropertyAssignments()

    PropertyAssignmentFetchOptionsAdapter withPropertyAssignmentsUsing(Object fetchOptions)

    PluginFetchOptionsAdapter withValidationPlugin()

    PluginFetchOptionsAdapter withValidationPluginUsing(Object fetchOptions)
}
