package life.qbic.api.v1.openbis.adapter

interface ExperimentTypeFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    ExperimentTypeSortOptionsAdapter getSortBy()

    boolean hasPropertyAssignments()

    boolean hasValidationPlugin()

    ExperimentTypeSortOptionsAdapter sortBy()

    PropertyAssignmentFetchOptionsAdapter withPropertyAssignments()

    PropertyAssignmentFetchOptionsAdapter withPropertyAssignmentsUsing(Object fetchOptions)

    PluginFetchOptionsAdapter withValidationPlugin()

    PluginFetchOptionsAdapter withValidationPluginUsing(Object fetchOptions)
}
