package life.qbic.api.v1.openbis.adapter

interface MaterialFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    MaterialSortOptionsAdapter getSortBy()

    boolean hasHistory()

    boolean hasMaterialProperties()

    boolean hasProperties()

    boolean hasRegistrator()

    boolean hasTags()

    boolean hasType()

    MaterialSortOptionsAdapter sortBy()

    HistoryEntryFetchOptionsAdapter withHistory()

    HistoryEntryFetchOptionsAdapter withHistoryUsing(Object fetchOptions)

    MaterialFetchOptionsAdapter withMaterialProperties()

    MaterialFetchOptionsAdapter withMaterialPropertiesUsing(Object fetchOptions)

    PropertyFetchOptionsAdapter withProperties()

    PropertyFetchOptionsAdapter withPropertiesUsing(Object fetchOptions)

    PersonFetchOptionsAdapter withRegistrator()

    PersonFetchOptionsAdapter withRegistratorUsing(Object fetchOptions)

    TagFetchOptionsAdapter withTags()

    TagFetchOptionsAdapter withTagsUsing(Object fetchOptions)

    MaterialTypeFetchOptionsAdapter withType()

    MaterialTypeFetchOptionsAdapter withTypeUsing(Object fetchOptions)
}
