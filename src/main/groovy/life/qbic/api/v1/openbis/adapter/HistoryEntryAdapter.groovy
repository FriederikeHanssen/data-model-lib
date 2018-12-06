package life.qbic.api.v1.openbis.adapter

interface HistoryEntryAdapter {

    PersonAdapter getAuthor()

    HistoryEntryFetchOptionsAdapter getFetchOptions()

    Date getValidFrom()

    Date getValidTo()
}