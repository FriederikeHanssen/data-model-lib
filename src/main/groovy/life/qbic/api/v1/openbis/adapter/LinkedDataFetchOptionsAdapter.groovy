package life.qbic.api.v1.openbis.adapter

interface LinkedDataFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    LinkedDataSortOptionsAdapter getSortBy()

    boolean hasExternalDms()

    LinkedDataSortOptionsAdapter sortBy()

    ExternalDmsFetchOptionsAdapter withExternalDms()

    ExternalDmsFetchOptionsAdapter withExternalDmsUsing(Object fetchOptions)

}