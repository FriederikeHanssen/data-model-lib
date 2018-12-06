package life.qbic.api.v1.openbis.adapter

interface PhysicalDataFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    PhysicalDataSortOptionsAdapter getSortBy()

    boolean hasLocatorType()

    boolean hasStorageFormat()

    PhysicalDataSortOptionsAdapter sortBy()

    LocatorTypeFetchOptionsAdapter withLocatorType()

    LocatorTypeFetchOptionsAdapter withLocatorTypeUsing(Object fetchOptions)

    StorageFormatFetchOptionsAdapter withStorageFormat()

    StorageFormatFetchOptionsAdapter withStorageFormatUsing(Object fetchOptions)


}