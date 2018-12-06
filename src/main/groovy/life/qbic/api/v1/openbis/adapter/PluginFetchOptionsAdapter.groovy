package life.qbic.api.v1.openbis.adapter

interface PluginFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    PluginSortOptionsAdapter getSortBy()

    boolean hasRegistrator()

    boolean hasScript()

    PluginSortOptionsAdapter sortBy()

    PersonFetchOptionsAdapter withRegistrator()

    PersonFetchOptionsAdapter withRegistratorUsing(Object fetchOptions)

    EmptyFetchOptionsAdapter withScript()

    EmptyFetchOptionsAdapter withScriptUsing(Object fetchOptions)
}