package life.qbic.api.v1.openbis.adapter

interface DataSetTypeFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    DataSetTypeSortOptionsAdapter getSortBy()

    boolean hasPropertyAssignments()

    boolean hasValidationPlugin()

    DataSetTypeSortOptionsAdapter sortBy()

    PropertyAssignmentFetchOptionsAdapter withPropertyAssignments()

    PropertyAssignmentFetchOptionsAdapter withPropertyAssignmentsUsing(Object fetchOptions)

    PluginFetchOptionsAdapter withValidationPlugin()

    PluginFetchOptionsAdapter withValidationPluginUsing(Object fetchOptions)

}