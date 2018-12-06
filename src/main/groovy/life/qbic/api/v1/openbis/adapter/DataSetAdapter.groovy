package life.qbic.api.v1.openbis.adapter

interface DataSetAdapter {

    Date getAccessDate()

    List<DataSetAdapter> getChildren()

    String getCode()

    List<DataSetAdapter> getComponents()

    List<DataSetAdapter> getContainers()

    String getDataProducer()

    Date getDataProductionDate()

    DataStoreAdapter getDataStore()

    ExperimentAdapter getExperiment()

    DataSetFetchOptionsAdapter getFetchOptions()

    List<HistoryEntryAdapter> getHistory()

    DataSetKindAdapter getKind()

    LinkedDataAdapter getLinkedData()

    Map<String, MaterialAdapter> getMaterialProperties()

    MaterialAdapter getMaterialProperty(Object propertyName)

    Date getModificationDate()

    PersonAdapter getModifier()

    List<DataSetAdapter> getParents()

    DataSetPermIdAdapter getPermId()

    PhysicalDataAdapter getPhysicalData()

    Map<String, String> getProperties()

    String getProperty(Object propertyName)

    Date getRegistrationDate()

    PersonAdapter getRegistrator()

    SampleAdapter getSample()

    Set<TagAdapter>  getTags()

    DataSetTypeAdapter getType()

    boolean isMeasured()

    boolean isPostRegistered()


}