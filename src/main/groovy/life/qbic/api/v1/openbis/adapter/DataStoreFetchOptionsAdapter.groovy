package life.qbic.api.v1.openbis.adapter

interface DataStoreFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter 	getFetchOptionsStringBuilder()

    DataStoreSortOptionsAdapter 	getSortBy()

    DataStoreSortOptionsAdapter 	sortBy()

}