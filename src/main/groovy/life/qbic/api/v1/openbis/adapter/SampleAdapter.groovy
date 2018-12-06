package life.qbic.api.v1.openbis.adapter

/**
 * Provides an access interface for `QbicSampleVX` objects.
 * http://svnsis.ethz.ch/doc/openbis/18.06.2/javadoc/ serves as guide for necessary methods
 * Currently focusing on getters alone
 * @author: Sven Fillinger, QBiC
 *
 * TODO: add setters
 */
interface SampleAdapter {

    List<AttachmentAdapter> getAttachments()

    List<SampleAdapter> getChildren()

    String getCode()

    List<SampleAdapter> getComponents()

    SampleAdapter getContainer()

    List<DataSetAdapter>  getDataSets()

    ExperimentAdapter getExperiment()

    SampleFetchOptionsAdapter getFetchOptions()

    List<HistoryEntryAdapter> getHistory()

    SampleIdentifierAdapter getIdentifier()

    Map<String, MaterialAdapter> getMaterialProperties()

    MaterialAdapter getMaterialProperty(propertyName)

    Date getModificationDate()

    PersonAdapter getModifier()

    List<SampleAdapter> getParents()

    SamplePermIdAdapter getPermId()

    ProjectAdapter getProject()

    Map<String, String> getProperties()

    String getProperty(propertyName)

    Date getRegistrationDate()

    PersonAdapter getRegistrator()

    SpaceAdapter getSpace()

    Set<TagAdapter> getTags()

    SampleTypeAdapter getType()

}
