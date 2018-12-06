package life.qbic.api.v1.openbis.adapter

interface SampleFetchOptionsAdapter {

    List<AttachmentAdapter> getAttachments()

    List<SampleAdapter> getChildren()

    String getCode()

    List<SampleAdapter> getComponents()

    SampleAdapter getContainer()

    List<DataSetAdapter> getDataSets()

    ExperimentAdapter getExperiment()

    SampleFetchOptionsAdapter getFetchOptions()

    List<HistoryEntryAdapter> getHistory()

    SampleIdentifierAdapter getIdentifier()

    Map<String, MaterialAdapter> getMaterialProperties()

    MaterialAdapter getMaterialProperty(String propertyName)

    Date getModificationDate()

    PersonAdapter getModifier()

    List<SampleAdapter> getParents()

    SamplePermIdAdapter getPermId()

    ProjectAdapter getProject()

    Map<String, String> getProperties()

    String getProperty(String propertyName)

    Date getRegistrationDate()

    PersonAdapter getRegistrator()

    SpaceAdapter getSpace()

    Set<TagAdapter> getTags()

    SampleTypeAdapter getType()
}