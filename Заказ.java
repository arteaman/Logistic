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

public class Заказ extends Agent
{
  // Параметры

  public 
Склад  заказчик;

  /**
   * Возвращает значение по умолчанию параметра <code>заказчик</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public Склад _заказчик_DefaultValue_xjal() {
    final Заказ self = this;
    return null;
  }

  public void set_заказчик( Склад value ) {
    if (value == this.заказчик) {
      return;
    }
    Склад _oldValue_xjal = this.заказчик;
    this.заказчик = value;
    onChange_заказчик_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter заказчик.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_заказчик()</code> method instead.
   */
  protected void onChange_заказчик() {
    onChange_заказчик_xjal( заказчик );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_заказчик_xjal( Склад oldValue ) {  
  }


  public 
double  объём;

  /**
   * Возвращает значение по умолчанию параметра <code>объём</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _объём_DefaultValue_xjal() {
    final Заказ self = this;
    return 0.0;
  }

  public void set_объём( double value ) {
    if (value == this.объём) {
      return;
    }
    double _oldValue_xjal = this.объём;
    this.объём = value;
    onChange_объём_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter объём.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_объём()</code> method instead.
   */
  protected void onChange_объём() {
    onChange_объём_xjal( объём );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_объём_xjal( double oldValue ) {  
  }


  public 
Склад  назначение;

  /**
   * Возвращает значение по умолчанию параметра <code>назначение</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public Склад _назначение_DefaultValue_xjal() {
    final Заказ self = this;
    return null;
  }

  public void set_назначение( Склад value ) {
    if (value == this.назначение) {
      return;
    }
    Склад _oldValue_xjal = this.назначение;
    this.назначение = value;
    onChange_назначение_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter назначение.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_назначение()</code> method instead.
   */
  protected void onChange_назначение() {
    onChange_назначение_xjal( назначение );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_назначение_xjal( Склад oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    заказчик = _заказчик_DefaultValue_xjal();
    объём = _объём_DefaultValue_xjal();
    назначение = _назначение_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "заказчик":
      if ( _callOnChange_xjal ) {
        set_заказчик( (Склад) _value_xjal );
      } else {
        заказчик = (Склад) _value_xjal;
      }
      return true;
    case "объём":
      if ( _callOnChange_xjal ) {
        set_объём( ((Number) _value_xjal).doubleValue() );
      } else {
        объём = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "назначение":
      if ( _callOnChange_xjal ) {
        set_назначение( (Склад) _value_xjal );
      } else {
        назначение = (Склад) _value_xjal;
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "заказчик": _result_xjal = заказчик; break;
    case "объём": _result_xjal = объём; break;
    case "назначение": _result_xjal = назначение; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "заказчик" );
      list.add( "объём" );
      list.add( "назначение" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Заказ.class );
  
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


  // Области
  public ViewArea viewZ = new ViewArea( this, null, 0, 0, 450, 600 );
  public ViewArea _origin_VA = new ViewArea( this, "[Нач. координат]", 0, 0, 1440.0, 900.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "viewZ", this.viewZ );
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 2 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("SansSerif", 0, 16 );
  protected static final Color _shapeBox_Fill_Color = new Color( 0xFFE8B90F, true );
  protected static final Color __ps2_Fill_Color = new Color( 0x18000000, true );
  protected static final Color __ps3_Fill_Color = new Color( 0x50FFFFFF, true );
  protected static final Color __ps4_Line_Color = new Color( 0xFF4A3500, true );
  protected static final Color __ps5_Line_Color = new Color( 0xFF9F7E0A, true );
  protected static final Color __ps6_Line_Color = new Color( 0xFF9F7E0A, true );
  @AnyLogicInternalCodegenAPI
  protected static final int _shapeBox = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps2 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps3 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps4 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps5 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps6 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _box = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 8;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 9;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBox_pointsDX_xjal() {
    return new double[] { 0.0, 14.261, 14.261, 0.0, -14.261, -14.261,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBox_pointsDY_xjal() {
    return new double[] { 0.0, -7.13, -21.391, -28.522, -21.391, -7.13,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBox_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps2_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 14.261, 14.261,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps2_pointsDY_xjal() {
    return new double[] { 0.0, -14.261, -21.391, -7.13,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps2_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps3_pointsDX_xjal() {
    return new double[] { 0.0, 14.261, 0.0, -14.261,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps3_pointsDY_xjal() {
    return new double[] { 0.0, -7.13, -14.261, -7.13,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps3_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps4_pointsDX_xjal() {
    return new double[] { 0.0, 14.261, 14.261, 0.0, -14.261, -14.261,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps4_pointsDY_xjal() {
    return new double[] { 0.0, -7.13, -21.391, -28.522, -21.391, -7.13,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps4_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(box, text);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _box:
        if (true) {
          ShapeGroup self = this.box;
          
viewZ.navigateTo(); 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  protected ShapePolyLine shapeBox;
  protected ShapePolyLine _ps2;
  protected ShapePolyLine _ps3;
  protected ShapePolyLine _ps4;
  protected ShapeLine _ps5;
  protected ShapeLine _ps6;
  protected ShapeGroup box;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
getIndex() 
);
  }
  
  protected ShapeText text;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    shapeBox = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 14.263, 0.0, null, _shapeBox_Fill_Color,
            6, _shapeBox_pointsDX_xjal(), _shapeBox_pointsDY_xjal(), _shapeBox_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps2 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 14.263, 0.0, null, __ps2_Fill_Color,
            4, __ps2_pointsDX_xjal(), __ps2_pointsDY_xjal(), __ps2_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps3 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, null, __ps3_Fill_Color,
            4, __ps3_pointsDX_xjal(), __ps3_pointsDY_xjal(), __ps3_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps4 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 14.263, 0.0, __ps4_Line_Color, null,
            6, __ps4_pointsDX_xjal(), __ps4_pointsDY_xjal(), __ps4_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps5 = new ShapeLine(
		SHAPE_DRAW_2D, true, -7.13, -10.697, 0.0, __ps5_Line_Color, 
 		11.0,	3.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID );

    _ps6 = new ShapeLine(
		SHAPE_DRAW_2D, true, 14.263, -7.13, 0.0, __ps6_Line_Color, 
 		-16.0,	3.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID );

    text = new ShapeText(
        SHAPE_DRAW_2D, false,70.0, 450.0, 0.0, 0.0, 
        black,"",
        _text_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    box = new ShapeGroup( Заказ.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , shapeBox
	     , _ps2
	     , _ps3
	     , _ps4
	     , _ps5
	     , _ps6 ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _box, 0, clickx, clicky );
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
  public Заказ( Engine engine, Agent owner, AgentList<? extends Заказ> ownerPopulation ) {
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
  public Заказ() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Заказ( Склад заказчик, double объём, Склад назначение ) {
    markParametersAreSet();
    this.заказчик = заказчик;
    this.объём = объём;
    this.назначение = назначение;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Присвоение начальных значений простым переменным
    setupPlainVariables_Заказ_xjal();
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Заказ.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Заказ.this, getElementProperty( "пробавперёд.Заказ.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Соединители с нереплицированными объектами
    // Создание реплицированных вложенных объектов
    setupInitialConditions_xjal( Заказ.class );
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
setLocation(заказчик); 
  }

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Заказ_xjal();
  }

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Заказ_xjal() {
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


  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Заказ> getPopulation() {
    return (AgentList<? extends Заказ>) super.getPopulation();
  }

  public List<? extends Заказ> agentsInRange( double distance ) {
    return (List<? extends Заказ>) super.agentsInRange( distance );
  }



}
