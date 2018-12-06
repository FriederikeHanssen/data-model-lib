package life.qbic.api.v1.openbis.adapter

interface HistoryEntryFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    HistoryEntrySortOptionsAdapter getSortBy()

    boolean hasAuthor()

    HistoryEntrySortOptionsAdapter sortBy()

    PersonFetchOptionsAdapter withAuthor()

    PersonFetchOptionsAdapter withAuthorUsing(Object fetchOptions)
}