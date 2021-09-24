package com.dev.delta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.delta.data.ActivityDBService;
import com.dev.delta.data.ArticleDBService;
import com.dev.delta.data.BankAccountDBService;
import com.dev.delta.data.BankTransferSBService;
import com.dev.delta.data.BreakDownDBService;
import com.dev.delta.data.CityDBService;
import com.dev.delta.data.ClientDBService;
import com.dev.delta.data.CountryDBService;
import com.dev.delta.data.CustomerContractDBService;
import com.dev.delta.data.DeliveryVoucherDBService;
import com.dev.delta.data.DepartementDBService;
import com.dev.delta.data.EmployeeDBService;
import com.dev.delta.data.EventDBService;
import com.dev.delta.data.ExternalProviderDBService;
import com.dev.delta.data.FamilyDBService;
import com.dev.delta.data.InterventionDBService;
import com.dev.delta.data.InterventionStateDBService;
import com.dev.delta.data.JobDBService;
import com.dev.delta.data.LeaveDBService;
import com.dev.delta.data.MAchineDBService;
import com.dev.delta.data.MessagingDBService;
import com.dev.delta.data.NotificationDBService;
import com.dev.delta.data.OperatorDBService;
import com.dev.delta.data.OrderDBService;
import com.dev.delta.data.PartDBService;
import com.dev.delta.data.PartOrderDBService;
import com.dev.delta.data.PoviderDBService;
import com.dev.delta.data.PreventiveMaintenanceDBService;
import com.dev.delta.data.ProductionDBService;
import com.dev.delta.data.ProviderContractDBService;
import com.dev.delta.data.PurshaseOrderDBService;
import com.dev.delta.data.StorageAreaDBService;
import com.dev.delta.data.TerminitionDBService;
import com.dev.delta.data.TypeLEaveDBService;
import com.dev.delta.data.TypeTerminaisonDBService;
import com.dev.delta.data.UnitDBService;
import com.dev.delta.data.UserDBService;
import com.dev.delta.data.VATDBService;
import com.dev.delta.entities.CustomerContract;
import com.dev.delta.entities.ExternalProvider;
import com.dev.delta.entities.Leave;
import com.dev.delta.entities.Provider;
import com.dev.delta.entities.ProviderContract;
import com.dev.delta.entities.StorageArea;
import com.dev.delta.entities.TypeTermination;
import com.dev.delta.repositories.ActivityRepository;
import com.dev.delta.repositories.DeliveryVoucherRepository;
import com.dev.delta.repositories.FamilyRepository;
import com.dev.delta.repositories.JobbRepository;
import com.dev.delta.repositories.MachineRepository;
import com.dev.delta.repositories.VatRepository;
import com.dev.delta.services.BankAccountService;

@SpringBootApplication
public class SpringbootMegasteelThymleafCodecanyonApplication implements CommandLineRunner {

	@Autowired
	ArticleDBService articleDBService;
	
	@Autowired
	UserDBService userDBService;
	
	@Autowired
	UnitDBService unitDBService;
	
	@Autowired
	ActivityDBService activityDBService;
	
	@Autowired
	FamilyDBService familyDBService;
	
	@Autowired
	StorageAreaDBService areaDBService;
	
	@Autowired
	MAchineDBService machineDBService;
	
	@Autowired
	ClientDBService clientDBService;
	
	@Autowired
	BreakDownDBService breakDownDBService;
	
	@Autowired
	VATDBService vatdbService;
	
	@Autowired
	DeliveryVoucherDBService  deliveryVoucherDBService;
	
	@Autowired
	PartDBService  partDBService;
	
	@Autowired 
	OrderDBService orderDBService;
	
	@Autowired
	PreventiveMaintenanceDBService preventiveMaintenanceDBService;
	
	@Autowired
	StorageAreaDBService storageAreaDBService;
	
	@Autowired
	OperatorDBService operatorDBService;
	
	@Autowired
	InterventionDBService interventionDBService;
	
	@Autowired
	TypeLEaveDBService typeLEaveDBService;
	
	@Autowired
	LeaveDBService leaveDBService;
	
	@Autowired
	CustomerContractDBService customerContractDBService;
	
	@Autowired
	ExternalProviderDBService externalProviderDBService;
	
	@Autowired
	PoviderDBService providerDBService;
	
	@Autowired
	EmployeeDBService employeeDBService;
	
	@Autowired
	public InterventionStateDBService  interventionStateDBService;
	
	@Autowired
	public JobDBService jobDBService;
	
	@Autowired
	public DepartementDBService departementDBService;
	
	@Autowired
	public PurshaseOrderDBService  purshaseOrderDBService;
	@Autowired
	public PartOrderDBService PartOrderDBService;
	
	@Autowired
	public ProviderContractDBService providerContractDBService;
	
	@Autowired
	public TypeTerminaisonDBService TypeTerminaisonDBService;
	
	
	@Autowired
	public TerminitionDBService TerminitionDBService;
	
	@Autowired
	public BankAccountDBService bankAccountDBService;
	
	@Autowired
	public CountryDBService countryDBService ;
	
	@Autowired
	public CityDBService cityDBService;
	
	@Autowired
	public EventDBService eventDBService  ;
	
	@Autowired
	public ProductionDBService productionDBService;
	
	@Autowired
	public BankTransferSBService bankTransferSBService;
	
	@Autowired
	public NotificationDBService notificationDBService;
	
	@Autowired
	public MessagingDBService messagingDBService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMegasteelThymleafCodecanyonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		departementDBService.populate();
		jobDBService.populate();
		interventionStateDBService.populate();
		partDBService.populate();
		vatdbService.populate();
		breakDownDBService.populate();
		areaDBService.populate();
		employeeDBService.populate();
		unitDBService.populate();
		articleDBService.populate();	
		userDBService.populate();
		familyDBService.populate();
		activityDBService.populate();
		machineDBService.populate();
		clientDBService.populate();
		storageAreaDBService.populate();
		deliveryVoucherDBService.populate();
		interventionDBService.populate();
		preventiveMaintenanceDBService.populate();
		operatorDBService.populate();
		typeLEaveDBService.populate();
		leaveDBService.populate();
		customerContractDBService.populate();
		externalProviderDBService.populate();
		providerDBService.populate();
		orderDBService.populate();
		partDBService.populate();
		PartOrderDBService.populate();
		purshaseOrderDBService.populate();
		TypeTerminaisonDBService.populate();
		TerminitionDBService.populate();
		providerContractDBService.populate();
		bankAccountDBService.populate();
		countryDBService.populate();
		cityDBService.populate();
		bankTransferSBService.populate();
		eventDBService.populate();
		productionDBService.populate();
		messagingDBService.populate();
		notificationDBService.populate();
		
	}

}
