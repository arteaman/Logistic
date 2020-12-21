package Лог;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import com.anylogic.libraries.processmodeling.*;
import com.anylogic.libraries.fluid.*;
import com.anylogic.libraries.modules.markup_descriptors.*;

import com.querydsl.core.Tuple;
import com.querydsl.sql.SQLBindings;
import static пробавперёд.DBDescriptor.*;

import java.awt.geom.Arc2D;

public class Терминал extends Agent
{
  // Параметры
  // Простые переменные

  public 
int 
 A;
  public 
int 
 variable;
  public 
int 
 B;
  public 
double 
 груз_все;
  public 
double 
 коэф_загрузки_все;
  public 
double 
 расстояние_все;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Терминал.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }



	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Вложенные объекты

  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _грузовики_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  public com.anylogic.libraries.processmodeling.ResourcePool<
Грузовик 
> грузовики;
  public com.anylogic.libraries.processmodeling.Enter<
Заказ 
> обработкаЗаказа;
  public com.anylogic.libraries.processmodeling.Seize<
Заказ 
> takeVehicle;
  public com.anylogic.libraries.processmodeling.Release<
Заказ 
> releaseVehicle;
  public com.anylogic.libraries.processmodeling.Sink<
Заказ 
> sink;
  public com.anylogic.libraries.processmodeling.TimeMeasureStart<
Заказ 
> timeMeasureStart;
  public com.anylogic.libraries.processmodeling.TimeMeasureEnd<
Заказ 
> timeTotal;
  public com.anylogic.libraries.processmodeling.Delay<
Заказ 
> delivering;
  public com.anylogic.libraries.processmodeling.SelectOutput<
Заказ 
> вместимостьГрузовик;
  public com.anylogic.libraries.processmodeling.ResourcePool<
Машина 
> машины;
  public com.anylogic.libraries.processmodeling.Seize<
Заказ 
> takeVehicle1;
  public com.anylogic.libraries.processmodeling.Release<
Заказ 
> releaseVehicle1;
  public com.anylogic.libraries.processmodeling.Delay<
Заказ 
> delivering1;
  public com.anylogic.libraries.processmodeling.SelectOutput<
Заказ 
> вместиомстьМашина;
  public com.anylogic.libraries.processmodeling.Sink<
Заказ 
> sink1;
  public com.anylogic.libraries.processmodeling.Delay<
Заказ 
> планирование;
  public com.anylogic.libraries.processmodeling.SelectOutput<
Заказ 
> наОжидание;
  public com.anylogic.libraries.processmodeling.Release<
Заказ 
> releaseVehicle2;
  public com.anylogic.libraries.processmodeling.Delay<
Заказ 
> синхронизация;
  public com.anylogic.libraries.processmodeling.Delay<
Заказ 
> синхронизация1;
  public com.anylogic.libraries.processmodeling.SelectOutput<
Заказ 
> наОжидание1;
  public com.anylogic.libraries.processmodeling.Release<
Заказ 
> releaseVehicle3;
  public com.anylogic.libraries.processmodeling.Seize<
Заказ 
> takeVehicle2;

  public String getNameOf( Agent ao ) {
    if ( ao == грузовики ) return "грузовики";
    if ( ao == обработкаЗаказа ) return "обработкаЗаказа";
    if ( ao == takeVehicle ) return "takeVehicle";
    if ( ao == releaseVehicle ) return "releaseVehicle";
    if ( ao == sink ) return "sink";
    if ( ao == timeMeasureStart ) return "timeMeasureStart";
    if ( ao == timeTotal ) return "timeTotal";
    if ( ao == delivering ) return "delivering";
    if ( ao == вместимостьГрузовик ) return "вместимостьГрузовик";
    if ( ao == машины ) return "машины";
    if ( ao == takeVehicle1 ) return "takeVehicle1";
    if ( ao == releaseVehicle1 ) return "releaseVehicle1";
    if ( ao == delivering1 ) return "delivering1";
    if ( ao == вместиомстьМашина ) return "вместиомстьМашина";
    if ( ao == sink1 ) return "sink1";
    if ( ao == планирование ) return "планирование";
    if ( ao == наОжидание ) return "наОжидание";
    if ( ao == releaseVehicle2 ) return "releaseVehicle2";
    if ( ao == синхронизация ) return "синхронизация";
    if ( ao == синхронизация1 ) return "синхронизация1";
    if ( ao == наОжидание1 ) return "наОжидание1";
    if ( ao == releaseVehicle3 ) return "releaseVehicle3";
    if ( ao == takeVehicle2 ) return "takeVehicle2";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }


  public String getNameOf( AgentList<?> aolist ) {
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    return super.getAnimationSettingsOf( aolist );
  }


  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Грузовик> instantiate_грузовики_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Грузовик> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Грузовик>( getEngine(), this, null ) {
      @Override
      @AnyLogicInternalCodegenAPI
      public boolean isLoggingToDB(LoggingType loggingType) {
        return false;
      }

      @Override
      public Agent newUnit(  ) {
        return _грузовики_newUnit_xjal( this );
      }

      @AnyLogicInternalCodegenAPI
      public SpeedUnits getUnitsForCodeOf_speed() {
        return KPH;
      }
      @Override
      public AgentList population( Грузовик unit ) {
        return _грузовики_population_xjal( this, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_грузовики_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Грузовик> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = 
main.колвоГрузовиков 
;
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = 
main.скоростьГрузовиков 
;
    self.speed = KPH.convertTo( self.speed, MPS );
    self.homeNodes = self._homeNodes_DefaultValue_xjal();
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = 
true 
;
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_грузовики_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Грузовик> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<Заказ> instantiate_обработкаЗаказа_xjal() {
    com.anylogic.libraries.processmodeling.Enter<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_обработкаЗаказа_xjal( final com.anylogic.libraries.processmodeling.Enter<Заказ> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_обработкаЗаказа_xjal( com.anylogic.libraries.processmodeling.Enter<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Seize<Заказ> instantiate_takeVehicle_xjal() {
    com.anylogic.libraries.processmodeling.Seize<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Seize<Заказ>( getEngine(), this, null ) {
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Заказ agent ) {
        return _takeVehicle_resourcePool_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Заказ agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _takeVehicle_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double timeout( Заказ agent ) {
        return _takeVehicle_timeout_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_timeout() {
        return DAY;
      }
      @Override
      public void onSeizeUnit( Заказ agent, Agent unit ) {
        _takeVehicle_onSeizeUnit_xjal( this, agent, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_takeVehicle_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, TableInput _t ) {
    self.seizeFromOnePool = 
true 
;
    self.seizePolicy = self._seizePolicy_DefaultValue_xjal();
    self.capacity = 
500 
;
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.destinationType = self._destinationType_DefaultValue_xjal();
    self.entityLocationQueue = self._entityLocationQueue_DefaultValue_xjal();
    self.terminatedTaskProcessing = self._terminatedTaskProcessing_DefaultValue_xjal();
    self.suspendResumeEntities = self._suspendResumeEntities_DefaultValue_xjal();
    self.customizeResourceChoice = self._customizeResourceChoice_DefaultValue_xjal();
    self.taskStartBlocksAreConnected = self._taskStartBlocksAreConnected_DefaultValue_xjal();
    self.taskStartBlocks = self._taskStartBlocks_DefaultValue_xjal();
    self.enableTimeout = 
true 
;
    self.enablePreemption = self._enablePreemption_DefaultValue_xjal();
    self.canceledUnitsBehavior = self._canceledUnitsBehavior_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_takeVehicle_xjal( com.anylogic.libraries.processmodeling.Seize<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Release<Заказ> instantiate_releaseVehicle_xjal() {
    com.anylogic.libraries.processmodeling.Release<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Release<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_releaseVehicle_xjal( final com.anylogic.libraries.processmodeling.Release<Заказ> self, TableInput _t ) {
    self.releaseMode = self._releaseMode_DefaultValue_xjal();
    self.seizeBlocks = self._seizeBlocks_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_releaseVehicle_xjal( com.anylogic.libraries.processmodeling.Release<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<Заказ> instantiate_sink_xjal() {
    com.anylogic.libraries.processmodeling.Sink<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_sink_xjal( final com.anylogic.libraries.processmodeling.Sink<Заказ> self, TableInput _t ) {
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sink_xjal( com.anylogic.libraries.processmodeling.Sink<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.TimeMeasureStart<Заказ> instantiate_timeMeasureStart_xjal() {
    com.anylogic.libraries.processmodeling.TimeMeasureStart<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.TimeMeasureStart<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_timeMeasureStart_xjal( final com.anylogic.libraries.processmodeling.TimeMeasureStart<Заказ> self, TableInput _t ) {
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_timeMeasureStart_xjal( com.anylogic.libraries.processmodeling.TimeMeasureStart<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.TimeMeasureEnd<Заказ> instantiate_timeTotal_xjal() {
    com.anylogic.libraries.processmodeling.TimeMeasureEnd<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.TimeMeasureEnd<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_timeTotal_xjal( final com.anylogic.libraries.processmodeling.TimeMeasureEnd<Заказ> self, TableInput _t ) {
    self.startObjects = new com.anylogic.libraries.processmodeling.TimeMeasureStart[]
{ timeMeasureStart } 
;
    self.datasetCapacity = 
500 
;
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_timeTotal_xjal( com.anylogic.libraries.processmodeling.TimeMeasureEnd<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Заказ> instantiate_delivering_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_delivering_xjal( final com.anylogic.libraries.processmodeling.Delay<Заказ> self, TableInput _t ) {
    self.type = 
self.MANUAL 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_delivering_xjal( com.anylogic.libraries.processmodeling.Delay<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput<Заказ> instantiate_вместимостьГрузовик_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Заказ>( getEngine(), this, null ) {
      @Override
      public boolean condition( Заказ agent ) {
        return _вместимостьГрузовик_condition_xjal( this, agent );
      }
      @Override
      public void onEnter( Заказ agent ) {
        _вместимостьГрузовик_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_вместимостьГрузовик_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, TableInput _t ) {
    self.conditionIsProbabilistic = 
false 
;
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_вместимостьГрузовик_xjal( com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Машина> instantiate_машины_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Машина> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Машина>( getEngine(), this, null ) {
      @Override
      public Agent newUnit(  ) {
        return _машины_newUnit_xjal( this );
      }

      @AnyLogicInternalCodegenAPI
      public SpeedUnits getUnitsForCodeOf_speed() {
        return KPH;
      }
      @Override
      public AgentList population( Машина unit ) {
        return _машины_population_xjal( this, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_машины_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Машина> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = 
main.колвоМашин 
;
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = 
main.скоростьМашин 
;
    self.speed = KPH.convertTo( self.speed, MPS );
    self.homeNodes = self._homeNodes_DefaultValue_xjal();
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = 
true 
;
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_машины_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Машина> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Seize<Заказ> instantiate_takeVehicle1_xjal() {
    com.anylogic.libraries.processmodeling.Seize<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Seize<Заказ>( getEngine(), this, null ) {
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Заказ agent ) {
        return _takeVehicle1_resourcePool_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Заказ agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _takeVehicle1_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public void onSeizeUnit( Заказ agent, Agent unit ) {
        _takeVehicle1_onSeizeUnit_xjal( this, agent, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_takeVehicle1_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, TableInput _t ) {
    self.seizeFromOnePool = 
true 
;
    self.seizePolicy = self._seizePolicy_DefaultValue_xjal();
    self.capacity = 
500 
;
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.destinationType = self._destinationType_DefaultValue_xjal();
    self.entityLocationQueue = self._entityLocationQueue_DefaultValue_xjal();
    self.terminatedTaskProcessing = self._terminatedTaskProcessing_DefaultValue_xjal();
    self.suspendResumeEntities = self._suspendResumeEntities_DefaultValue_xjal();
    self.customizeResourceChoice = self._customizeResourceChoice_DefaultValue_xjal();
    self.taskStartBlocksAreConnected = self._taskStartBlocksAreConnected_DefaultValue_xjal();
    self.taskStartBlocks = self._taskStartBlocks_DefaultValue_xjal();
    self.enableTimeout = self._enableTimeout_DefaultValue_xjal();
    self.enablePreemption = self._enablePreemption_DefaultValue_xjal();
    self.canceledUnitsBehavior = self._canceledUnitsBehavior_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_takeVehicle1_xjal( com.anylogic.libraries.processmodeling.Seize<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Release<Заказ> instantiate_releaseVehicle1_xjal() {
    com.anylogic.libraries.processmodeling.Release<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Release<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_releaseVehicle1_xjal( final com.anylogic.libraries.processmodeling.Release<Заказ> self, TableInput _t ) {
    self.releaseMode = self._releaseMode_DefaultValue_xjal();
    self.seizeBlocks = self._seizeBlocks_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_releaseVehicle1_xjal( com.anylogic.libraries.processmodeling.Release<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Заказ> instantiate_delivering1_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_delivering1_xjal( final com.anylogic.libraries.processmodeling.Delay<Заказ> self, TableInput _t ) {
    self.type = 
self.MANUAL 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_delivering1_xjal( com.anylogic.libraries.processmodeling.Delay<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput<Заказ> instantiate_вместиомстьМашина_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Заказ>( getEngine(), this, null ) {
      @Override
      public boolean condition( Заказ agent ) {
        return _вместиомстьМашина_condition_xjal( this, agent );
      }
      @Override
      public void onEnter( Заказ agent ) {
        _вместиомстьМашина_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_вместиомстьМашина_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, TableInput _t ) {
    self.conditionIsProbabilistic = 
false 
;
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_вместиомстьМашина_xjal( com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<Заказ> instantiate_sink1_xjal() {
    com.anylogic.libraries.processmodeling.Sink<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_sink1_xjal( final com.anylogic.libraries.processmodeling.Sink<Заказ> self, TableInput _t ) {
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sink1_xjal( com.anylogic.libraries.processmodeling.Sink<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Заказ> instantiate_планирование_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Заказ>( getEngine(), this, null ) {
      @Override
      public double delayTime( Заказ agent ) {
        return _планирование_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return HOUR;
      }
      @Override
      public void onEnter( Заказ agent, double delayTime ) {
        _планирование_onEnter_xjal( this, agent, delayTime );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_планирование_xjal( final com.anylogic.libraries.processmodeling.Delay<Заказ> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacity = 
100 
;
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_планирование_xjal( com.anylogic.libraries.processmodeling.Delay<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput<Заказ> instantiate_наОжидание_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Заказ>( getEngine(), this, null ) {
      @Override
      public boolean condition( Заказ agent ) {
        return _наОжидание_condition_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_наОжидание_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, TableInput _t ) {
    self.conditionIsProbabilistic = 
false 
;
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_наОжидание_xjal( com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Release<Заказ> instantiate_releaseVehicle2_xjal() {
    com.anylogic.libraries.processmodeling.Release<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Release<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_releaseVehicle2_xjal( final com.anylogic.libraries.processmodeling.Release<Заказ> self, TableInput _t ) {
    self.releaseMode = self._releaseMode_DefaultValue_xjal();
    self.seizeBlocks = self._seizeBlocks_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_releaseVehicle2_xjal( com.anylogic.libraries.processmodeling.Release<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Заказ> instantiate_синхронизация_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Заказ>( getEngine(), this, null ) {
      @Override
      public double delayTime( Заказ agent ) {
        return _синхронизация_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return HOUR;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_синхронизация_xjal( final com.anylogic.libraries.processmodeling.Delay<Заказ> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacity = 
100 
;
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_синхронизация_xjal( com.anylogic.libraries.processmodeling.Delay<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Заказ> instantiate_синхронизация1_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Заказ>( getEngine(), this, null ) {
      @Override
      public double delayTime( Заказ agent ) {
        return _синхронизация1_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return HOUR;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_синхронизация1_xjal( final com.anylogic.libraries.processmodeling.Delay<Заказ> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacity = 
100 
;
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_синхронизация1_xjal( com.anylogic.libraries.processmodeling.Delay<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput<Заказ> instantiate_наОжидание1_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Заказ>( getEngine(), this, null ) {
      @Override
      public boolean condition( Заказ agent ) {
        return _наОжидание1_condition_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_наОжидание1_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, TableInput _t ) {
    self.conditionIsProbabilistic = 
false 
;
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_наОжидание1_xjal( com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Release<Заказ> instantiate_releaseVehicle3_xjal() {
    com.anylogic.libraries.processmodeling.Release<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Release<Заказ>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_releaseVehicle3_xjal( final com.anylogic.libraries.processmodeling.Release<Заказ> self, TableInput _t ) {
    self.releaseMode = self._releaseMode_DefaultValue_xjal();
    self.seizeBlocks = self._seizeBlocks_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_releaseVehicle3_xjal( com.anylogic.libraries.processmodeling.Release<Заказ> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Seize<Заказ> instantiate_takeVehicle2_xjal() {
    com.anylogic.libraries.processmodeling.Seize<Заказ> _result_xjal = new com.anylogic.libraries.processmodeling.Seize<Заказ>( getEngine(), this, null ) {
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Заказ agent ) {
        return _takeVehicle2_resourcePool_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Заказ agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _takeVehicle2_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double timeout( Заказ agent ) {
        return _takeVehicle2_timeout_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_timeout() {
        return DAY;
      }
      @Override
      public void onSeizeUnit( Заказ agent, Agent unit ) {
        _takeVehicle2_onSeizeUnit_xjal( this, agent, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_takeVehicle2_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, TableInput _t ) {
    self.seizeFromOnePool = 
true 
;
    self.seizePolicy = self._seizePolicy_DefaultValue_xjal();
    self.capacity = 
500 
;
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.destinationType = self._destinationType_DefaultValue_xjal();
    self.entityLocationQueue = self._entityLocationQueue_DefaultValue_xjal();
    self.terminatedTaskProcessing = self._terminatedTaskProcessing_DefaultValue_xjal();
    self.suspendResumeEntities = self._suspendResumeEntities_DefaultValue_xjal();
    self.customizeResourceChoice = self._customizeResourceChoice_DefaultValue_xjal();
    self.taskStartBlocksAreConnected = self._taskStartBlocksAreConnected_DefaultValue_xjal();
    self.taskStartBlocks = self._taskStartBlocks_DefaultValue_xjal();
    self.enableTimeout = 
true 
;
    self.enablePreemption = self._enablePreemption_DefaultValue_xjal();
    self.canceledUnitsBehavior = self._canceledUnitsBehavior_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_takeVehicle2_xjal( com.anylogic.libraries.processmodeling.Seize<Заказ> self, TableInput _t ) {
  }

  private Agent _грузовики_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Грузовик> self ) {
    Agent _value;
    _value = 
new пробавперёд.Грузовик() 
;
    return _value;
  }
  private AgentList _грузовики_population_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Грузовик> self, Грузовик unit ) {
    AgentList _value;
    _value = 
main.грузовики 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _takeVehicle_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
грузовики 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _takeVehicle_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_NEAREST 
;
    return _value;
  }
  private double _takeVehicle_timeout_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent ) {
    double _value;
    _value = 
0.5 
;
    _value = DAY.convertTo( _value, SECOND );
    return _value;
  }
  private void _takeVehicle_onSeizeUnit_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent, Agent unit ) {
    
send( agent, unit ); 
;
  }
  private boolean _вместимостьГрузовик_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, Заказ agent ) {
    boolean _value;
    _value = 
(agent.объём < main.вместимость_грузовик) 
;
    return _value;
  }
  private void _вместимостьГрузовик_onEnter_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, Заказ agent ) {
    
for ( int i=0; i < main.грузовики.size(); i++ ) {
	if ( main.грузовики.get(i).занят == 1) {
		if ( main.грузовики.get(i).заказ.назначение.getIndex() == agent.заказчик.getIndex() ) {
		A = 1;
		break;
		}
	}
} 
;
  }
  private Agent _машины_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Машина> self ) {
    Agent _value;
    _value = 
new пробавперёд.Машина() 
;
    return _value;
  }
  private AgentList _машины_population_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Машина> self, Машина unit ) {
    AgentList _value;
    _value = 
main.машины 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _takeVehicle1_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
машины 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _takeVehicle1_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_NEAREST 
;
    return _value;
  }
  private void _takeVehicle1_onSeizeUnit_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent, Agent unit ) {
    
send( agent, unit ); 
;
  }
  private boolean _вместиомстьМашина_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, Заказ agent ) {
    boolean _value;
    _value = 
(agent.объём < main.вместимость_машина) 
;
    return _value;
  }
  private void _вместиомстьМашина_onEnter_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, Заказ agent ) {
    
for ( int i=0; i < main.машины.size(); i++ ) {
	if ( main.машины.get(i).занят == 1) {
		if ( main.машины.get(i).заказ.назначение.getIndex() == agent.заказчик.getIndex() ) {
		B = 1;
		break;
		}
	}
} 
;
  }
  private double _планирование_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Заказ> self, Заказ agent ) {
    double _value;
    _value = 
triangular( 1, 3, 1.7)
 
;
    _value = HOUR.convertTo( _value, SECOND );
    return _value;
  }
  private void _планирование_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<Заказ> self, Заказ agent, double delayTime ) {
    
A = 0;
B = 0; 
;
  }
  private boolean _наОжидание_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, Заказ agent ) {
    boolean _value;
    _value = 
//true
(A == 0) 
;
    return _value;
  }
  private double _синхронизация_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Заказ> self, Заказ agent ) {
    double _value;
    _value = 
0.01 
;
    _value = HOUR.convertTo( _value, SECOND );
    return _value;
  }
  private double _синхронизация1_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Заказ> self, Заказ agent ) {
    double _value;
    _value = 
0.01 
;
    _value = HOUR.convertTo( _value, SECOND );
    return _value;
  }
  private boolean _наОжидание1_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Заказ> self, Заказ agent ) {
    boolean _value;
    _value = 
//true
(B == 0) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _takeVehicle2_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
машины 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _takeVehicle2_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_NEAREST 
;
    return _value;
  }
  private double _takeVehicle2_timeout_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent ) {
    double _value;
    _value = 
0.5 
;
    _value = DAY.convertTo( _value, SECOND );
    return _value;
  }
  private void _takeVehicle2_onSeizeUnit_xjal( final com.anylogic.libraries.processmodeling.Seize<Заказ> self, Заказ agent, Agent unit ) {
    
send( agent, unit ); 
;
  }
  // Функции

  
int 
 find(  ) { 

int var = 0;
for ( int i=0; i < main.грузовики.size(); i++ ) {
	if ( main.грузовики.get(i).занят == 1) {
		if ( main.грузовики.get(i).заказ.назначение.getIndex() == main.заказы.get(variable).заказчик.getIndex() ) {
		var = 1;
		break;
		}
	}
}
return var; 
  }
  // Области
  public ViewArea viewArea = new ViewArea( this, null, 0, 0, 1440, 820 );
  public ViewArea _origin_VA = new ViewArea( this, "[Нач. координат]", 0, 0, 1440.0, 900.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "viewArea", this.viewArea );
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 2 + super.getViewAreas( _output );
  }
  protected static final Color __ps268_Fill_Color = new Color( 0x50000000, true );
  protected static final Color __ps269_Fill_Color = new Color( 0xFF99EA00, true );
  protected static final Color __ps270_Fill_Color = new Color( 0xFF83C800, true );
  protected static final Color __ps271_Fill_Color = new Color( 0xFF679E00, true );
  protected static final Color __ps272_Fill_Color = new Color( 0xFF416400, true );
  protected static final Color __ps273_Line_Color = new Color( 0xFF679E00, true );
  protected static final Color __ps274_Line_Color = new Color( 0xFF83C800, true );
  protected static final Color __ps275_Line_Color = new Color( 0xFF203200, true );
  @AnyLogicInternalCodegenAPI
  protected static final int __ps268 = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps269 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps270 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps271 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps272 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps273 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps274 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps275 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _store = 9;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 10;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps268_pointsDX_xjal() {
    return new double[] { 0.0, 4.329, 17.316, 12.987,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps268_pointsDY_xjal() {
    return new double[] { 0.0, 2.187, -4.369, -6.552,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps268_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps269_pointsDX_xjal() {
    return new double[] { 0.0, 12.987, 0.0, -12.984,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps269_pointsDY_xjal() {
    return new double[] { 0.0, -6.552, -13.106, -6.552,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps269_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps270_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 12.987, 12.987,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps270_pointsDY_xjal() {
    return new double[] { 0.0, -8.737, -2.185, 6.557,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps270_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps271_pointsDX_xjal() {
    return new double[] { 0.0, 12.987, 12.987, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps271_pointsDY_xjal() {
    return new double[] { 0.0, -6.552, -15.286, -8.737,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps271_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps272_pointsDX_xjal() {
    return new double[] { 0.0, 10.822, 21.644, 21.644, 10.822, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps272_pointsDY_xjal() {
    return new double[] { 0.0, 5.461, 0.0, -5.461, 0.0, -5.461,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps272_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps275_pointsDX_xjal() {
    return new double[] { 0.0, 12.987, 12.987, 0.0, -12.984, -12.984,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps275_pointsDY_xjal() {
    return new double[] { 0.0, -6.552, -15.286, -21.843, -15.286, -6.552,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps275_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(store);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _store:
        if (true) {
          ShapeGroup self = this.store;
          
viewArea.navigateTo(); 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  protected ShapePolyLine _ps268;
  protected ShapePolyLine _ps269;
  protected ShapePolyLine _ps270;
  protected ShapePolyLine _ps271;
  protected ShapePolyLine _ps272;
  protected ShapeLine _ps273;
  protected ShapeLine _ps274;
  protected ShapePolyLine _ps275;
  protected ShapeGroup store;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    _ps268 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 13.109, 0.0, null, __ps268_Fill_Color,
            4, __ps268_pointsDX_xjal(), __ps268_pointsDY_xjal(), __ps268_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps269 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 4.372, 0.0, null, __ps269_Fill_Color,
            4, __ps269_pointsDX_xjal(), __ps269_pointsDY_xjal(), __ps269_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps270 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -12.984, 6.557, 0.0, null, __ps270_Fill_Color,
            4, __ps270_pointsDX_xjal(), __ps270_pointsDY_xjal(), __ps270_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps271 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 13.109, 0.0, null, __ps271_Fill_Color,
            4, __ps271_pointsDX_xjal(), __ps271_pointsDY_xjal(), __ps271_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps272 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -10.822, 7.648, 0.0, null, __ps272_Fill_Color,
            6, __ps272_pointsDX_xjal(), __ps272_pointsDY_xjal(), __ps272_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps273 = new ShapeLine(
		SHAPE_DRAW_2D, true, 2.164, 12.013, 0.0, __ps273_Line_Color, 
 		0.0,	-12.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID );

    _ps274 = new ShapeLine(
		SHAPE_DRAW_2D, true, -2.164, 12.013, 0.0, __ps274_Line_Color, 
 		0.0,	-12.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID );

    _ps275 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 13.109, 0.0, __ps275_Line_Color, null,
            6, __ps275_pointsDX_xjal(), __ps275_pointsDY_xjal(), __ps275_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    store = new ShapeGroup( Терминал.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , _ps268
	     , _ps269
	     , _ps270
	     , _ps271
	     , _ps272
	     , _ps273
	     , _ps274
	     , _ps275 ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _store, 0, clickx, clicky );
      }
    };

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Статическая инициализация элементов, у которых разрешено программное управление
  private void instantiatePersistentElements_xjal() {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

	


  /**
   * Конструктор
   */
  public Терминал( Engine engine, Agent owner, AgentList<? extends Терминал> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    грузовики = instantiate_грузовики_xjal();
    обработкаЗаказа = instantiate_обработкаЗаказа_xjal();
    takeVehicle = instantiate_takeVehicle_xjal();
    releaseVehicle = instantiate_releaseVehicle_xjal();
    sink = instantiate_sink_xjal();
    timeMeasureStart = instantiate_timeMeasureStart_xjal();
    timeTotal = instantiate_timeTotal_xjal();
    delivering = instantiate_delivering_xjal();
    вместимостьГрузовик = instantiate_вместимостьГрузовик_xjal();
    машины = instantiate_машины_xjal();
    takeVehicle1 = instantiate_takeVehicle1_xjal();
    releaseVehicle1 = instantiate_releaseVehicle1_xjal();
    delivering1 = instantiate_delivering1_xjal();
    вместиомстьМашина = instantiate_вместиомстьМашина_xjal();
    sink1 = instantiate_sink1_xjal();
    планирование = instantiate_планирование_xjal();
    наОжидание = instantiate_наОжидание_xjal();
    releaseVehicle2 = instantiate_releaseVehicle2_xjal();
    синхронизация = instantiate_синхронизация_xjal();
    синхронизация1 = instantiate_синхронизация1_xjal();
    наОжидание1 = instantiate_наОжидание1_xjal();
    releaseVehicle3 = instantiate_releaseVehicle3_xjal();
    takeVehicle2 = instantiate_takeVehicle2_xjal();
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
    main = get_Main();
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Терминал() {
  }
  
  /**
   * Создание экземпляров вложенных объектов
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Создание экземпляров вложенных объектов
    instantiatePopulations_xjal();
    // Присвоение начальных значений простым переменным
    setupPlainVariables_Терминал_xjal();
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Терминал.this, true, 0, 0, 0, 0 , level );
    // Создание экземпляров вложенных объектов
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Терминал.this, getElementProperty( "пробавперёд.Терминал.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Создание нереплицированных вложенных объектов
    setupParameters_грузовики_xjal( грузовики, null );
    doBeforeCreate_грузовики_xjal( грузовики, null );
    грузовики.createAsEmbedded();
    setupParameters_обработкаЗаказа_xjal( обработкаЗаказа, null );
    doBeforeCreate_обработкаЗаказа_xjal( обработкаЗаказа, null );
    обработкаЗаказа.createAsEmbedded();
    setupParameters_takeVehicle_xjal( takeVehicle, null );
    doBeforeCreate_takeVehicle_xjal( takeVehicle, null );
    takeVehicle.createAsEmbedded();
    setupParameters_releaseVehicle_xjal( releaseVehicle, null );
    doBeforeCreate_releaseVehicle_xjal( releaseVehicle, null );
    releaseVehicle.createAsEmbedded();
    setupParameters_sink_xjal( sink, null );
    doBeforeCreate_sink_xjal( sink, null );
    sink.createAsEmbedded();
    setupParameters_timeMeasureStart_xjal( timeMeasureStart, null );
    doBeforeCreate_timeMeasureStart_xjal( timeMeasureStart, null );
    timeMeasureStart.createAsEmbedded();
    setupParameters_timeTotal_xjal( timeTotal, null );
    doBeforeCreate_timeTotal_xjal( timeTotal, null );
    timeTotal.createAsEmbedded();
    setupParameters_delivering_xjal( delivering, null );
    doBeforeCreate_delivering_xjal( delivering, null );
    delivering.createAsEmbedded();
    setupParameters_вместимостьГрузовик_xjal( вместимостьГрузовик, null );
    doBeforeCreate_вместимостьГрузовик_xjal( вместимостьГрузовик, null );
    вместимостьГрузовик.createAsEmbedded();
    setupParameters_машины_xjal( машины, null );
    doBeforeCreate_машины_xjal( машины, null );
    машины.createAsEmbedded();
    setupParameters_takeVehicle1_xjal( takeVehicle1, null );
    doBeforeCreate_takeVehicle1_xjal( takeVehicle1, null );
    takeVehicle1.createAsEmbedded();
    setupParameters_releaseVehicle1_xjal( releaseVehicle1, null );
    doBeforeCreate_releaseVehicle1_xjal( releaseVehicle1, null );
    releaseVehicle1.createAsEmbedded();
    setupParameters_delivering1_xjal( delivering1, null );
    doBeforeCreate_delivering1_xjal( delivering1, null );
    delivering1.createAsEmbedded();
    setupParameters_вместиомстьМашина_xjal( вместиомстьМашина, null );
    doBeforeCreate_вместиомстьМашина_xjal( вместиомстьМашина, null );
    вместиомстьМашина.createAsEmbedded();
    setupParameters_sink1_xjal( sink1, null );
    doBeforeCreate_sink1_xjal( sink1, null );
    sink1.createAsEmbedded();
    setupParameters_планирование_xjal( планирование, null );
    doBeforeCreate_планирование_xjal( планирование, null );
    планирование.createAsEmbedded();
    setupParameters_наОжидание_xjal( наОжидание, null );
    doBeforeCreate_наОжидание_xjal( наОжидание, null );
    наОжидание.createAsEmbedded();
    setupParameters_releaseVehicle2_xjal( releaseVehicle2, null );
    doBeforeCreate_releaseVehicle2_xjal( releaseVehicle2, null );
    releaseVehicle2.createAsEmbedded();
    setupParameters_синхронизация_xjal( синхронизация, null );
    doBeforeCreate_синхронизация_xjal( синхронизация, null );
    синхронизация.createAsEmbedded();
    setupParameters_синхронизация1_xjal( синхронизация1, null );
    doBeforeCreate_синхронизация1_xjal( синхронизация1, null );
    синхронизация1.createAsEmbedded();
    setupParameters_наОжидание1_xjal( наОжидание1, null );
    doBeforeCreate_наОжидание1_xjal( наОжидание1, null );
    наОжидание1.createAsEmbedded();
    setupParameters_releaseVehicle3_xjal( releaseVehicle3, null );
    doBeforeCreate_releaseVehicle3_xjal( releaseVehicle3, null );
    releaseVehicle3.createAsEmbedded();
    setupParameters_takeVehicle2_xjal( takeVehicle2, null );
    doBeforeCreate_takeVehicle2_xjal( takeVehicle2, null );
    takeVehicle2.createAsEmbedded();
	 // Соединители с нереплицированными объектами
    sink.in.connect( timeTotal.out ); // connector2
    timeTotal.in.connect( releaseVehicle.out ); // connector8
    releaseVehicle.in.connect( delivering.out ); // connector3
    releaseVehicle1.in.connect( delivering1.out ); // connector10
    takeVehicle1.out.connect( delivering1.in ); // connector11
    releaseVehicle1.out.connect( timeTotal.in ); // connector7
    вместиомстьМашина.in.connect( вместимостьГрузовик.outF ); // connector12
    sink1.in.connect( вместиомстьМашина.outF ); // connector13
    наОжидание.outF.connect( releaseVehicle2.in ); // connector16
    планирование.in.connect( timeMeasureStart.out ); // connector1
    timeMeasureStart.in.connect( обработкаЗаказа.out ); // connector5
    планирование.out.connect( вместимостьГрузовик.in ); // connector14
    takeVehicle.out.connect( delivering.in ); // connector4
    наОжидание.outT.connect( takeVehicle.in ); // connector15
    вместимостьГрузовик.outT.connect( синхронизация.in ); // connector
    синхронизация1.in.connect( вместиомстьМашина.outT ); // connector19
    takeVehicle.outTimeout.connect( takeVehicle2.in ); // connector9
    наОжидание1.outT.connect( takeVehicle1.in ); // connector20
    наОжидание1.outF.connect( releaseVehicle3.in ); // connector21
    releaseVehicle3.out.connect( планирование.in ); // connector22
    синхронизация.out.connect( наОжидание.in ); // connector18
    наОжидание1.in.connect( синхронизация1.out ); // connector24
    releaseVehicle2.out.connect( планирование.in ); // connector25
    takeVehicle2.out.connect( delivering1.in ); // connector6
    takeVehicle2.outTimeout.connect( takeVehicle.in ); // connector17
    // Создание реплицированных вложенных объектов
    setupInitialConditions_xjal( Терминал.class );
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    грузовики.startAsEmbedded();
    обработкаЗаказа.startAsEmbedded();
    takeVehicle.startAsEmbedded();
    releaseVehicle.startAsEmbedded();
    sink.startAsEmbedded();
    timeMeasureStart.startAsEmbedded();
    timeTotal.startAsEmbedded();
    delivering.startAsEmbedded();
    вместимостьГрузовик.startAsEmbedded();
    машины.startAsEmbedded();
    takeVehicle1.startAsEmbedded();
    releaseVehicle1.startAsEmbedded();
    delivering1.startAsEmbedded();
    вместиомстьМашина.startAsEmbedded();
    sink1.startAsEmbedded();
    планирование.startAsEmbedded();
    наОжидание.startAsEmbedded();
    releaseVehicle2.startAsEmbedded();
    синхронизация.startAsEmbedded();
    синхронизация1.startAsEmbedded();
    наОжидание1.startAsEmbedded();
    releaseVehicle3.startAsEmbedded();
    takeVehicle2.startAsEmbedded();
  }
 

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Терминал_xjal();
  }

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Терминал_xjal() {
    расстояние_все = 
0 
;
  }

  // API пользователя -----------------------------------------------------
  public Main get_Main() {
    {
      Agent owner = getOwner();
      if ( owner instanceof Main ) return (Main) owner;
    }
    return null;
  }

  /**
   * Переменная только для чтения. <em>Значение переменной не должно изменяться пользователем.</em>
   */
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient пробавперёд.Main main;

  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    
Заказ  msg = (Заказ) _msg_xjal;
    Agent sender = _sender_xjal;
    
обработкаЗаказа.take( msg ); 
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( грузовики );
    list.add( обработкаЗаказа );
    list.add( takeVehicle );
    list.add( releaseVehicle );
    list.add( sink );
    list.add( timeMeasureStart );
    list.add( timeTotal );
    list.add( delivering );
    list.add( вместимостьГрузовик );
    list.add( машины );
    list.add( takeVehicle1 );
    list.add( releaseVehicle1 );
    list.add( delivering1 );
    list.add( вместиомстьМашина );
    list.add( sink1 );
    list.add( планирование );
    list.add( наОжидание );
    list.add( releaseVehicle2 );
    list.add( синхронизация );
    list.add( синхронизация1 );
    list.add( наОжидание1 );
    list.add( releaseVehicle3 );
    list.add( takeVehicle2 );
    return list;
  }

  public AgentList<? extends Терминал> getPopulation() {
    return (AgentList<? extends Терминал>) super.getPopulation();
  }

  public List<? extends Терминал> agentsInRange( double distance ) {
    return (List<? extends Терминал>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    грузовики.onDestroy();
    обработкаЗаказа.onDestroy();
    takeVehicle.onDestroy();
    releaseVehicle.onDestroy();
    sink.onDestroy();
    timeMeasureStart.onDestroy();
    timeTotal.onDestroy();
    delivering.onDestroy();
    вместимостьГрузовик.onDestroy();
    машины.onDestroy();
    takeVehicle1.onDestroy();
    releaseVehicle1.onDestroy();
    delivering1.onDestroy();
    вместиомстьМашина.onDestroy();
    sink1.onDestroy();
    планирование.onDestroy();
    наОжидание.onDestroy();
    releaseVehicle2.onDestroy();
    синхронизация.onDestroy();
    синхронизация1.onDestroy();
    наОжидание1.onDestroy();
    releaseVehicle3.onDestroy();
    takeVehicle2.onDestroy();
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    грузовики.doFinish();
    обработкаЗаказа.doFinish();
    takeVehicle.doFinish();
    releaseVehicle.doFinish();
    sink.doFinish();
    timeMeasureStart.doFinish();
    timeTotal.doFinish();
    delivering.doFinish();
    вместимостьГрузовик.doFinish();
    машины.doFinish();
    takeVehicle1.doFinish();
    releaseVehicle1.doFinish();
    delivering1.doFinish();
    вместиомстьМашина.doFinish();
    sink1.doFinish();
    планирование.doFinish();
    наОжидание.doFinish();
    releaseVehicle2.doFinish();
    синхронизация.doFinish();
    синхронизация1.doFinish();
    наОжидание1.doFinish();
    releaseVehicle3.doFinish();
    takeVehicle2.doFinish();
  }



}
