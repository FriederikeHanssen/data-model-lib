package life.qbic.api.v1.openbis.adapter

import ch.ethz.sis.openbis.generic.asapi.v3.dto.experiment.fetchoptions.ExperimentFetchOptions
import ch.ethz.sis.openbis.generic.asapi.v3.dto.history.fetchoptions.HistoryEntryFetchOptions

interface DataSetFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOPtionsStringBuilder()

    DataSetSortOptionsAdapter getSortBy()

    boolean hasChildren()

    boolean hasComponents()

    boolean hasContainers()

    boolean hasDataStore()

    boolean hasExperiment()

    boolean hasHistory()

    boolean hasLinkedData()

    boolean hasMaterialProperties()

    boolean hasModifier()

    boolean hasParents()

    boolean hasPhysicalData()

    boolean hasProperties()

    boolean hasRegistrator()

    boolean hasSample()

    boolean hasTags()

    boolean hasType()

    DataSetSortOptionsAdapter sortBy()

    DataSetFetchOptionsAdapter withChildren()

    DataSetFetchOptionsAdapter withChildrenUsing(Object fetchOptions)

    DataSetFetchOptionsAdapter withComponents()

    DataSetFetchOptionsAdapter withComponentsUsing(Object fetchOptions)

    DataSetFetchOptionsAdapter withContainers()

    DataSetFetchOptionsAdapter withContainersUsing(Object fetchOptions)

    DataStoreFetchOptionsAdapter withDataStore()

    DataStoreFetchOptionsAdapter withDataStoreUsing(Object fetchOptions)

    ExperimentFetchOptionsAdapter withExperiment()

    ExperimentFetchOptionsAdapter withExperimentUsing(Object fetchOptions)

    HistoryEntryFetchOptionsAdapter withHistory()

    HistoryEntryFetchOptionsAdapter withHistoryUsing(Object fetchOptions)

    LinkedDataFetchOptionsAdapter withLinkedData()

    LinkedDataFetchOptionsAdapter withLinkedDataUsing(Object fetchOptions)

    MaterialFetchOptionsAdapter withMaterialProperties()

    MaterialFetchOptionsAdapter withMaterialPropertiesUsing(Object fetchOptions)

    PersonFetchOptionsAdapter withModifier()

    PersonFetchOptionsAdapter withModifierUsing(Object fetchOptions)

    DataSetFetchOptionsAdapter withParents()

    DataSetFetchOptionsAdapter withParentsUsing(Object fetchOptions)

    PhysicalDataFetchOptionsAdapter withPhysicalData()

    PhysicalDataFetchOptionsAdapter withPhysicalDataUsing(Object fetchOptions)

    PropertyFetchOptionsAdapter withProperties()

    PropertyFetchOptionsAdapter withPropertiesUsing(Object fetchOptions)

    PersonFetchOptionsAdapter withRegistrator()

    PersonFetchOptionsAdapter withRegistratorUsing(Object fetchOptions)

    SampleFetchOptionsAdapter withSample()

    SampleFetchOptionsAdapter withSampleUsing(Object fetchOptions)

    TagFetchOptionsAdapter withTags()

    TagFetchOptionsAdapter withTagsUsing(Object fetchOptions)

    DataSetTypeFetchOptionsAdapter withType()

    DataSetTypeFetchOptionsAdapter withTypeUsing(Object fetchOptions)


}