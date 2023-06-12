# BE 리드미

```
be
├─ festo
│  ├─ .gradle
│  │  ├─ 7.6.1
│  │  │  ├─ checksums
│  │  │  │  ├─ checksums.lock
│  │  │  │  ├─ md5-checksums.bin
│  │  │  │  └─ sha1-checksums.bin
│  │  │  ├─ dependencies-accessors
│  │  │  │  ├─ dependencies-accessors.lock
│  │  │  │  └─ gc.properties
│  │  │  ├─ executionHistory
│  │  │  │  ├─ executionHistory.bin
│  │  │  │  └─ executionHistory.lock
│  │  │  ├─ fileChanges
│  │  │  │  └─ last-build.bin
│  │  │  ├─ fileHashes
│  │  │  │  ├─ fileHashes.bin
│  │  │  │  ├─ fileHashes.lock
│  │  │  │  └─ resourceHashesCache.bin
│  │  │  ├─ gc.properties
│  │  │  └─ vcsMetadata
│  │  ├─ buildOutputCleanup
│  │  │  ├─ buildOutputCleanup.lock
│  │  │  ├─ cache.properties
│  │  │  └─ outputFiles.bin
│  │  ├─ file-system.probe
│  │  └─ vcs-1
│  │     └─ gc.properties
│  ├─ .idea
│  │  ├─ codeStyles
│  │  │  └─ codeStyleConfig.xml
│  │  ├─ compiler.xml
│  │  ├─ dataSources
│  │  │  ├─ 32e9ba06-b770-47cb-910a-49f26145023e
│  │  │  │  └─ storage_v2
│  │  │  │     └─ _src_
│  │  │  │        └─ schema
│  │  │  │           ├─ information_schema.FNRwLQ.meta
│  │  │  │           ├─ mysql.osA4Bg.meta
│  │  │  │           ├─ performance_schema.kIw0nw.meta
│  │  │  │           └─ sys.zb4BAA.meta
│  │  │  └─ 32e9ba06-b770-47cb-910a-49f26145023e.xml
│  │  ├─ dataSources.local.xml
│  │  ├─ dataSources.xml
│  │  ├─ gradle.xml
│  │  ├─ jarRepositories.xml
│  │  ├─ misc.xml
│  │  ├─ modules
│  │  │  └─ festo.main.iml
│  │  ├─ modules.xml
│  │  ├─ uiDesigner.xml
│  │  ├─ vcs.xml
│  │  └─ workspace.xml
│  ├─ build
│  │  ├─ classes
│  │  │  └─ java
│  │  │     └─ main
│  │  │        └─ com
│  │  │           └─ example
│  │  │              └─ festo
│  │  │                 ├─ alert
│  │  │                 │  ├─ adapter
│  │  │                 │  │  ├─ in
│  │  │                 │  │  │  └─ web
│  │  │                 │  │  │     ├─ model
│  │  │                 │  │  │     │  └─ NotificationResponse.class
│  │  │                 │  │  │     ├─ NotificationController.class
│  │  │                 │  │  │     ├─ RequestDTO.class
│  │  │                 │  │  │     └─ TestController.class
│  │  │                 │  │  └─ out
│  │  │                 │  │     └─ persistence
│  │  │                 │  │        ├─ FcmDeviceTokenAdapter.class
│  │  │                 │  │        ├─ FcmDeviceTokenEntity.class
│  │  │                 │  │        ├─ FcmDeviceTokenRepository.class
│  │  │                 │  │        ├─ NotificationAdapter.class
│  │  │                 │  │        ├─ NotificationEntity$NotificationEntityBuilder.class
│  │  │                 │  │        ├─ NotificationEntity.class
│  │  │                 │  │        └─ NotificationRepository.class
│  │  │                 │  ├─ application
│  │  │                 │  │  ├─ port
│  │  │                 │  │  │  ├─ in
│  │  │                 │  │  │  │  ├─ LoadNotificationUseCase.class
│  │  │                 │  │  │  │  ├─ SaveFcmDeviceTokenUseCase.class
│  │  │                 │  │  │  │  └─ SaveNotificationUseCase.class
│  │  │                 │  │  │  └─ out
│  │  │                 │  │  │     ├─ LoadFcmDeviceTokenPort.class
│  │  │                 │  │  │     ├─ LoadNotificationPort.class
│  │  │                 │  │  │     └─ SaveNotificationPort.class
│  │  │                 │  │  └─ service
│  │  │                 │  │     ├─ FcmMessage$FcmMessageBuilder.class
│  │  │                 │  │     ├─ FcmMessage$Message$MessageBuilder.class
│  │  │                 │  │     ├─ FcmMessage$Message.class
│  │  │                 │  │     ├─ FcmMessage$Notification$NotificationBuilder.class
│  │  │                 │  │     ├─ FcmMessage$Notification.class
│  │  │                 │  │     ├─ FcmMessage.class
│  │  │                 │  │     ├─ FcmService.class
│  │  │                 │  │     ├─ FirebaseCloudMessageService.class
│  │  │                 │  │     └─ NotificationService.class
│  │  │                 │  └─ domain
│  │  │                 │     ├─ BoothInfo.class
│  │  │                 │     ├─ FcmDeviceToken.class
│  │  │                 │     ├─ FestivalInfo.class
│  │  │                 │     ├─ Notification$NotificationBuilder.class
│  │  │                 │     └─ Notification.class
│  │  │                 ├─ booth
│  │  │                 │  ├─ adapter
│  │  │                 │  │  ├─ in
│  │  │                 │  │  │  └─ web
│  │  │                 │  │  │     ├─ BoothController.class
│  │  │                 │  │  │     └─ model
│  │  │                 │  │  │        ├─ BoothCreationResponse.class
│  │  │                 │  │  │        ├─ BoothRequest.class
│  │  │                 │  │  │        ├─ BoothResponse$Booths$BoothsBuilder.class
│  │  │                 │  │  │        ├─ BoothResponse$Booths.class
│  │  │                 │  │  │        ├─ BoothResponse$BoothsByOwner$BoothsByOwnerBuilder.class
│  │  │                 │  │  │        ├─ BoothResponse$BoothsByOwner.class
│  │  │                 │  │  │        ├─ BoothResponse$Detail$DetailBuilder.class
│  │  │                 │  │  │        ├─ BoothResponse$Detail.class
│  │  │                 │  │  │        ├─ BoothResponse.class
│  │  │                 │  │  │        ├─ FiestaResponse$Owner$OwnerBuilder.class
│  │  │                 │  │  │        ├─ FiestaResponse$Owner.class
│  │  │                 │  │  │        ├─ FiestaResponse.class
│  │  │                 │  │  │        └─ RequestStatus.class
│  │  │                 │  │  └─ out
│  │  │                 │  │     ├─ AWSS3
│  │  │                 │  │     │  └─ SaveBoothImgService.class
│  │  │                 │  │     └─ persistence
│  │  │                 │  │        ├─ BoothEntity$BoothEntityBuilder.class
│  │  │                 │  │        ├─ BoothEntity.class
│  │  │                 │  │        ├─ BoothPersistenceAdapter.class
│  │  │                 │  │        └─ BoothRepository.class
│  │  │                 │  ├─ application
│  │  │                 │  │  ├─ port
│  │  │                 │  │  │  ├─ in
│  │  │                 │  │  │  │  ├─ ChangeBoothStatusUseCase.class
│  │  │                 │  │  │  │  ├─ GetBoothDetailUseCase.class
│  │  │                 │  │  │  │  ├─ GetBoothListUseCase.class
│  │  │                 │  │  │  │  ├─ GetFiestaListUseCase.class
│  │  │                 │  │  │  │  ├─ RegisterBoothCommand$RegisterBoothCommandBuilder.class
│  │  │                 │  │  │  │  ├─ RegisterBoothCommand.class
│  │  │                 │  │  │  │  └─ RegisterBoothUseCase.class
│  │  │                 │  │  │  └─ out
│  │  │                 │  │  │     ├─ LoadBoothPort.class
│  │  │                 │  │  │     ├─ LoadBoothStatusPort.class
│  │  │                 │  │  │     ├─ LoadFiestaListPort.class
│  │  │                 │  │  │     ├─ SaveBoothCommand$SaveBoothCommandBuilder.class
│  │  │                 │  │  │     ├─ SaveBoothCommand.class
│  │  │                 │  │  │     ├─ SaveBoothPort.class
│  │  │                 │  │  │     └─ SaveImgPort.class
│  │  │                 │  │  └─ sevice
│  │  │                 │  │     └─ BoothService.class
│  │  │                 │  └─ domain
│  │  │                 │     ├─ Booth$BoothBuilder.class
│  │  │                 │     ├─ Booth.class
│  │  │                 │     ├─ BoothStatus.class
│  │  │                 │     ├─ Fiesta.class
│  │  │                 │     ├─ Menu.class
│  │  │                 │     └─ Owner.class
│  │  │                 ├─ common
│  │  │                 │  ├─ event
│  │  │                 │  │  ├─ Event.class
│  │  │                 │  │  ├─ EventConfiguration.class
│  │  │                 │  │  └─ Events.class
│  │  │                 │  ├─ exception
│  │  │                 │  │  ├─ CustomIsPresentException.class
│  │  │                 │  │  ├─ CustomNoSuchException.class
│  │  │                 │  │  ├─ ErrorCode.class
│  │  │                 │  │  ├─ ErrorResponseEntity$ErrorResponseEntityBuilder.class
│  │  │                 │  │  ├─ ErrorResponseEntity.class
│  │  │                 │  │  └─ GlobalExceptionHandler.class
│  │  │                 │  ├─ jpa
│  │  │                 │  │  └─ MoneyConverter.class
│  │  │                 │  ├─ model
│  │  │                 │  │  └─ Money.class
│  │  │                 │  ├─ mutipartfile
│  │  │                 │  │  └─ MultipartJackson2HttpMessageConverter.class
│  │  │                 │  └─ S3
│  │  │                 │     ├─ AwsS3Config.class
│  │  │                 │     └─ S3Uploader.class
│  │  │                 ├─ festival
│  │  │                 │  ├─ adapter
│  │  │                 │  │  ├─ in
│  │  │                 │  │  │  └─ web
│  │  │                 │  │  │     ├─ FestivalController.class
│  │  │                 │  │  │     └─ model
│  │  │                 │  │  │        ├─ FestivalRequest.class
│  │  │                 │  │  │        ├─ FestivalResponse$Creation.class
│  │  │                 │  │  │        ├─ FestivalResponse$Detail$DetailBuilder.class
│  │  │                 │  │  │        ├─ FestivalResponse$Detail.class
│  │  │                 │  │  │        ├─ FestivalResponse$Invitation.class
│  │  │                 │  │  │        ├─ FestivalResponse$InviteCode.class
│  │  │                 │  │  │        ├─ FestivalResponse$IsOpen.class
│  │  │                 │  │  │        ├─ FestivalResponse$MainPage$MainPageBuilder.class
│  │  │                 │  │  │        ├─ FestivalResponse$MainPage.class
│  │  │                 │  │  │        ├─ FestivalResponse$Manager$ManagerBuilder.class
│  │  │                 │  │  │        ├─ FestivalResponse$Manager.class
│  │  │                 │  │  │        ├─ FestivalResponse$Search$SearchBuilder.class
│  │  │                 │  │  │        ├─ FestivalResponse$Search.class
│  │  │                 │  │  │        └─ FestivalResponse.class
│  │  │                 │  │  └─ out
│  │  │                 │  │     ├─ AWSS3
│  │  │                 │  │     │  └─ SaveFestivalImgService.class
│  │  │                 │  │     └─ persistence
│  │  │                 │  │        ├─ FestivalEntity$FestivalEntityBuilder.class
│  │  │                 │  │        ├─ FestivalEntity.class
│  │  │                 │  │        ├─ FestivalPersistenceAdapter.class
│  │  │                 │  │        ├─ FestivalRepository.class
│  │  │                 │  │        ├─ MainFestivalProjection.class
│  │  │                 │  │        └─ SearchFestivalProjection.class
│  │  │                 │  ├─ application
│  │  │                 │  │  ├─ port
│  │  │                 │  │  │  ├─ in
│  │  │                 │  │  │  │  ├─ GetFestivalDetailUseCase.class
│  │  │                 │  │  │  │  ├─ GetFestivalIdUseCase.class
│  │  │                 │  │  │  │  ├─ GetFestivalsUseCase.class
│  │  │                 │  │  │  │  ├─ GetInviteCodeUseCase.class
│  │  │                 │  │  │  │  ├─ RegisterFestivalCommand$RegisterFestivalCommandBuilder.class
│  │  │                 │  │  │  │  ├─ RegisterFestivalCommand.class
│  │  │                 │  │  │  │  └─ RegisterFestivalUseCase.class
│  │  │                 │  │  │  └─ out
│  │  │                 │  │  │     ├─ LoadFestivalDetailPort.class
│  │  │                 │  │  │     ├─ LoadFestivalIdPort.class
│  │  │                 │  │  │     ├─ LoadFestivalListPort.class
│  │  │                 │  │  │     ├─ LoadInviteCodePort.class
│  │  │                 │  │  │     ├─ LoadIsOpenFestivalPort.class
│  │  │                 │  │  │     ├─ SaveFestivalCommand$SaveFestivalCommandBuilder.class
│  │  │                 │  │  │     ├─ SaveFestivalCommand.class
│  │  │                 │  │  │     ├─ SaveFestivalPort.class
│  │  │                 │  │  │     └─ SaveImgPort.class
│  │  │                 │  │  └─ service
│  │  │                 │  │     └─ FestivalService.class
│  │  │                 │  └─ domain
│  │  │                 │     ├─ BoothInfo.class
│  │  │                 │     ├─ Festival.class
│  │  │                 │     ├─ FestivalStatus.class
│  │  │                 │     └─ Manager.class
│  │  │                 ├─ FestoApplication.class
│  │  │                 ├─ global
│  │  │                 │  ├─ auth
│  │  │                 │  │  ├─ CustomUserDetails.class
│  │  │                 │  │  ├─ CustomUserDetailService.class
│  │  │                 │  │  ├─ JwtAuthenticationFilter.class
│  │  │                 │  │  ├─ JwtExceptionFilter.class
│  │  │                 │  │  ├─ JwtUtil.class
│  │  │                 │  │  └─ model
│  │  │                 │  │     ├─ BaseResponseBody.class
│  │  │                 │  │     ├─ TokenInfo$TokenInfoBuilder.class
│  │  │                 │  │     └─ TokenInfo.class
│  │  │                 │  └─ config
│  │  │                 │     ├─ SecurityConfig.class
│  │  │                 │     └─ WebConfig.class
│  │  │                 ├─ member
│  │  │                 │  ├─ adapter
│  │  │                 │  │  ├─ in
│  │  │                 │  │  │  └─ web
│  │  │                 │  │  │     ├─ LoginController.class
│  │  │                 │  │  │     ├─ MemberController.class
│  │  │                 │  │  │     └─ model
│  │  │                 │  │  │        ├─ LoginRequest$LoginRequestBuilder.class
│  │  │                 │  │  │        ├─ LoginRequest.class
│  │  │                 │  │  │        ├─ LoginResponse.class
│  │  │                 │  │  │        └─ MemberInfoResponse.class
│  │  │                 │  │  └─ out
│  │  │                 │  │     └─ persistence
│  │  │                 │  │        ├─ MemberPersistenceAdapter.class
│  │  │                 │  │        └─ MemberRepository.class
│  │  │                 │  ├─ application
│  │  │                 │  │  ├─ port
│  │  │                 │  │  │  ├─ in
│  │  │                 │  │  │  │  ├─ LoginUseCase.class
│  │  │                 │  │  │  │  └─ MemberInfoUseCase.class
│  │  │                 │  │  │  └─ out
│  │  │                 │  │  │     ├─ JoinMemberPort.class
│  │  │                 │  │  │     ├─ LoadMemberPort.class
│  │  │                 │  │  │     └─ SaveFcmDeviceTokenPort.class
│  │  │                 │  │  └─ service
│  │  │                 │  │     ├─ LoginService.class
│  │  │                 │  │     └─ MemberService.class
│  │  │                 │  └─ domain
│  │  │                 │     ├─ AuthId.class
│  │  │                 │     ├─ Member$MemberBuilder.class
│  │  │                 │     ├─ Member.class
│  │  │                 │     └─ ProfileImageUrl.class
│  │  │                 ├─ mock
│  │  │                 │  ├─ MenuRequest.class
│  │  │                 │  ├─ MockBoothRequest.class
│  │  │                 │  ├─ MockDataController.class
│  │  │                 │  └─ MockDataRequest.class
│  │  │                 ├─ order
│  │  │                 │  ├─ adapter
│  │  │                 │  │  ├─ in
│  │  │                 │  │  │  └─ web
│  │  │                 │  │  │     ├─ model
│  │  │                 │  │  │     │  ├─ MenuResponse.class
│  │  │                 │  │  │     │  ├─ OrderDetailResponse.class
│  │  │                 │  │  │     │  ├─ OrderMenu.class
│  │  │                 │  │  │     │  ├─ OrderRequest.class
│  │  │                 │  │  │     │  ├─ OrderStatusChangeRequest.class
│  │  │                 │  │  │     │  ├─ OrderSummaryForBoothOwnerResponse.class
│  │  │                 │  │  │     │  ├─ OrderSummaryResponse.class
│  │  │                 │  │  │     │  ├─ PaymentInfo.class
│  │  │                 │  │  │     │  └─ WaitingCountResponse.class
│  │  │                 │  │  │     └─ OrderController.class
│  │  │                 │  │  └─ out
│  │  │                 │  │     └─ persistence
│  │  │                 │  │        ├─ BoothInfoPersistenceAdapter.class
│  │  │                 │  │        ├─ FestivalInfoPersistenceAdapter.class
│  │  │                 │  │        ├─ MenuPersistenceAdapter.class
│  │  │                 │  │        ├─ OrderEntity$OrderEntityBuilder.class
│  │  │                 │  │        ├─ OrderEntity.class
│  │  │                 │  │        ├─ OrderPersistenceAdapter.class
│  │  │                 │  │        └─ OrderRepository.class
│  │  │                 │  ├─ application
│  │  │                 │  │  ├─ port
│  │  │                 │  │  │  ├─ in
│  │  │                 │  │  │  │  ├─ LoadOrderUseCase.class
│  │  │                 │  │  │  │  ├─ OrderStatusChangeUseCase.class
│  │  │                 │  │  │  │  └─ PlaceOrderUseCase.class
│  │  │                 │  │  │  └─ out
│  │  │                 │  │  │     ├─ LoadBoothInfoPort.class
│  │  │                 │  │  │     ├─ LoadFestivalInfoPort.class
│  │  │                 │  │  │     ├─ LoadMenuPort.class
│  │  │                 │  │  │     ├─ LoadOrderPort.class
│  │  │                 │  │  │     ├─ PlaceOrderPort.class
│  │  │                 │  │  │     └─ UpdateOrderStatusPort.class
│  │  │                 │  │  └─ service
│  │  │                 │  │     ├─ OrdererService.class
│  │  │                 │  │     ├─ OrderService.class
│  │  │                 │  │     └─ OrderStatusChangedEventHandler.class
│  │  │                 │  └─ domain
│  │  │                 │     ├─ BoothInfo.class
│  │  │                 │     ├─ FestivalInfo.class
│  │  │                 │     ├─ Menu$MenuBuilder.class
│  │  │                 │     ├─ Menu.class
│  │  │                 │     ├─ Order$OrderBuilder.class
│  │  │                 │     ├─ Order.class
│  │  │                 │     ├─ Orderer.class
│  │  │                 │     ├─ OrderLine.class
│  │  │                 │     ├─ OrderNo.class
│  │  │                 │     ├─ OrderStatus.class
│  │  │                 │     └─ OrderStatusChangedEvent.class
│  │  │                 └─ product
│  │  │                    ├─ adapter
│  │  │                    │  ├─ in
│  │  │                    │  │  └─ web
│  │  │                    │  │     ├─ model
│  │  │                    │  │     │  ├─ ProductRegisterRequest.class
│  │  │                    │  │     │  └─ ProductResponse.class
│  │  │                    │  │     └─ ProductController.class
│  │  │                    │  └─ out
│  │  │                    │     ├─ AWSS3
│  │  │                    │     │  └─ SaveProductImgService.class
│  │  │                    │     └─ persistence
│  │  │                    │        ├─ ProductEntity$ProductEntityBuilder.class
│  │  │                    │        ├─ ProductEntity.class
│  │  │                    │        ├─ ProductPersistenceAdapter.class
│  │  │                    │        └─ ProductRepository.class
│  │  │                    ├─ application
│  │  │                    │  ├─ port
│  │  │                    │  │  ├─ in
│  │  │                    │  │  │  ├─ LoadProductUseCase.class
│  │  │                    │  │  │  ├─ RegisterProductCommand$RegisterProductCommandBuilder.class
│  │  │                    │  │  │  ├─ RegisterProductCommand.class
│  │  │                    │  │  │  └─ RegisterProductUseCase.class
│  │  │                    │  │  └─ out
│  │  │                    │  │     ├─ LoadBoothInfoPort.class
│  │  │                    │  │     ├─ LoadProductPort.class
│  │  │                    │  │     ├─ SaveImgPort.class
│  │  │                    │  │     └─ SaveProductPort.class
│  │  │                    │  └─ service
│  │  │                    │     └─ ProductService.class
│  │  │                    └─ domain
│  │  │                       ├─ BoothInfo.class
│  │  │                       ├─ Product$ProductBuilder.class
│  │  │                       └─ Product.class
│  │  ├─ generated
│  │  │  └─ sources
│  │  │     ├─ annotationProcessor
│  │  │     │  └─ java
│  │  │     │     └─ main
│  │  │     └─ headers
│  │  │        └─ java
│  │  │           └─ main
│  │  ├─ resources
│  │  │  └─ main
│  │  │     ├─ application.yml
│  │  │     ├─ firebase
│  │  │     │  ├─ fest-o-firebase-adminsdk.json
│  │  │     │  └─ google-services.json
│  │  │     ├─ static
│  │  │     └─ templates
│  │  └─ tmp
│  │     └─ compileJava
│  │        ├─ compileTransaction
│  │        │  ├─ annotation-output
│  │        │  ├─ compile-output
│  │        │  │  └─ com
│  │        │  │     └─ example
│  │        │  │        └─ festo
│  │        │  │           ├─ alert
│  │        │  │           │  ├─ adapter
│  │        │  │           │  │  ├─ in
│  │        │  │           │  │  │  └─ web
│  │        │  │           │  │  │     └─ model
│  │        │  │           │  │  └─ out
│  │        │  │           │  │     └─ persistence
│  │        │  │           │  ├─ application
│  │        │  │           │  │  ├─ port
│  │        │  │           │  │  │  ├─ in
│  │        │  │           │  │  │  └─ out
│  │        │  │           │  │  └─ service
│  │        │  │           │  └─ domain
│  │        │  │           ├─ booth
│  │        │  │           │  ├─ adapter
│  │        │  │           │  │  ├─ in
│  │        │  │           │  │  │  └─ web
│  │        │  │           │  │  │     └─ model
│  │        │  │           │  │  └─ out
│  │        │  │           │  │     └─ persistence
│  │        │  │           │  ├─ application
│  │        │  │           │  │  ├─ port
│  │        │  │           │  │  │  ├─ in
│  │        │  │           │  │  │  └─ out
│  │        │  │           │  │  └─ sevice
│  │        │  │           │  └─ domain
│  │        │  │           ├─ common
│  │        │  │           │  ├─ event
│  │        │  │           │  ├─ exception
│  │        │  │           │  ├─ jpa
│  │        │  │           │  └─ model
│  │        │  │           ├─ festival
│  │        │  │           │  ├─ adapter
│  │        │  │           │  │  ├─ in
│  │        │  │           │  │  │  └─ web
│  │        │  │           │  │  │     └─ model
│  │        │  │           │  │  └─ out
│  │        │  │           │  │     ├─ AWSS3
│  │        │  │           │  │     └─ persistence
│  │        │  │           │  ├─ application
│  │        │  │           │  │  ├─ port
│  │        │  │           │  │  │  ├─ in
│  │        │  │           │  │  │  └─ out
│  │        │  │           │  │  └─ service
│  │        │  │           │  └─ domain
│  │        │  │           ├─ global
│  │        │  │           │  ├─ auth
│  │        │  │           │  └─ config
│  │        │  │           ├─ member
│  │        │  │           │  ├─ adapter
│  │        │  │           │  │  ├─ in
│  │        │  │           │  │  │  └─ web
│  │        │  │           │  │  │     └─ model
│  │        │  │           │  │  └─ out
│  │        │  │           │  │     └─ persistence
│  │        │  │           │  ├─ application
│  │        │  │           │  │  ├─ port
│  │        │  │           │  │  │  ├─ in
│  │        │  │           │  │  │  └─ out
│  │        │  │           │  │  └─ service
│  │        │  │           │  └─ domain
│  │        │  │           ├─ mock
│  │        │  │           ├─ order
│  │        │  │           │  ├─ adapter
│  │        │  │           │  │  ├─ in
│  │        │  │           │  │  │  └─ web
│  │        │  │           │  │  │     └─ model
│  │        │  │           │  │  └─ out
│  │        │  │           │  │     └─ persistence
│  │        │  │           │  ├─ application
│  │        │  │           │  │  ├─ port
│  │        │  │           │  │  │  ├─ in
│  │        │  │           │  │  │  └─ out
│  │        │  │           │  │  └─ service
│  │        │  │           │  └─ domain
│  │        │  │           └─ product
│  │        │  │              ├─ adapter
│  │        │  │              │  ├─ in
│  │        │  │              │  │  └─ web
│  │        │  │              │  │     └─ model
│  │        │  │              │  └─ out
│  │        │  │              │     ├─ AWSS3
│  │        │  │              │     └─ persistence
│  │        │  │              ├─ application
│  │        │  │              │  ├─ port
│  │        │  │              │  │  ├─ in
│  │        │  │              │  │  └─ out
│  │        │  │              │  └─ service
│  │        │  │              └─ domain
│  │        │  ├─ header-output
│  │        │  └─ stash-dir
│  │        │     ├─ BoothService.class.uniqueId11
│  │        │     ├─ FcmDeviceToken.class.uniqueId4
│  │        │     ├─ FcmDeviceTokenAdapter.class.uniqueId16
│  │        │     ├─ FcmDeviceTokenEntity.class.uniqueId19
│  │        │     ├─ FcmDeviceTokenRepository.class.uniqueId10
│  │        │     ├─ FcmService.class.uniqueId3
│  │        │     ├─ FestivalService.class.uniqueId8
│  │        │     ├─ FirebaseCloudMessageService.class.uniqueId9
│  │        │     ├─ LoadFcmDeviceTokenPort.class.uniqueId13
│  │        │     ├─ LoadNotificationUseCase.class.uniqueId22
│  │        │     ├─ LoadOrderUseCase.class.uniqueId1
│  │        │     ├─ NotificationController.class.uniqueId21
│  │        │     ├─ NotificationResponse.class.uniqueId2
│  │        │     ├─ NotificationService.class.uniqueId6
│  │        │     ├─ OrderController.class.uniqueId14
│  │        │     ├─ OrderPersistenceAdapter.class.uniqueId17
│  │        │     ├─ OrderService.class.uniqueId7
│  │        │     ├─ OrderStatusChangedEventHandler.class.uniqueId18
│  │        │     ├─ OrderSummaryResponse.class.uniqueId15
│  │        │     ├─ ProductService.class.uniqueId0
│  │        │     ├─ SaveFcmDeviceTokenPort.class.uniqueId20
│  │        │     ├─ SecurityConfig.class.uniqueId12
│  │        │     └─ TestController.class.uniqueId5
│  │        └─ previous-compilation-data.bin
│  ├─ build.gradle
│  ├─ Dockerfile
│  ├─ gradle
│  │  └─ wrapper
│  │     ├─ gradle-wrapper.jar
│  │     └─ gradle-wrapper.properties
│  ├─ gradlew
│  ├─ gradlew.bat
│  ├─ HELP.md
│  ├─ settings.gradle
│  └─ src
│     ├─ main
│     │  ├─ java
│     │  │  └─ com
│     │  │     └─ example
│     │  │        └─ festo
│     │  │           ├─ alert
│     │  │           │  ├─ adapter
│     │  │           │  │  ├─ in
│     │  │           │  │  │  └─ web
│     │  │           │  │  │     ├─ model
│     │  │           │  │  │     │  └─ NotificationResponse.java
│     │  │           │  │  │     ├─ NotificationController.java
│     │  │           │  │  │     ├─ RequestDTO.java
│     │  │           │  │  │     └─ TestController.java
│     │  │           │  │  └─ out
│     │  │           │  │     └─ persistence
│     │  │           │  │        ├─ FcmDeviceTokenAdapter.java
│     │  │           │  │        ├─ FcmDeviceTokenEntity.java
│     │  │           │  │        ├─ FcmDeviceTokenRepository.java
│     │  │           │  │        ├─ NotificationAdapter.java
│     │  │           │  │        ├─ NotificationEntity.java
│     │  │           │  │        └─ NotificationRepository.java
│     │  │           │  ├─ application
│     │  │           │  │  ├─ port
│     │  │           │  │  │  ├─ in
│     │  │           │  │  │  │  ├─ LoadNotificationUseCase.java
│     │  │           │  │  │  │  ├─ SaveFcmDeviceTokenUseCase.java
│     │  │           │  │  │  │  └─ SaveNotificationUseCase.java
│     │  │           │  │  │  └─ out
│     │  │           │  │  │     ├─ LoadFcmDeviceTokenPort.java
│     │  │           │  │  │     ├─ LoadNotificationPort.java
│     │  │           │  │  │     └─ SaveNotificationPort.java
│     │  │           │  │  └─ service
│     │  │           │  │     ├─ FcmMessage.java
│     │  │           │  │     ├─ FcmService.java
│     │  │           │  │     ├─ FirebaseCloudMessageService.java
│     │  │           │  │     └─ NotificationService.java
│     │  │           │  └─ domain
│     │  │           │     ├─ BoothInfo.java
│     │  │           │     ├─ FcmDeviceToken.java
│     │  │           │     ├─ FestivalInfo.java
│     │  │           │     └─ Notification.java
│     │  │           ├─ booth
│     │  │           │  ├─ adapter
│     │  │           │  │  ├─ in
│     │  │           │  │  │  └─ web
│     │  │           │  │  │     ├─ BoothController.java
│     │  │           │  │  │     └─ model
│     │  │           │  │  │        ├─ BoothCreationResponse.java
│     │  │           │  │  │        ├─ BoothRequest.java
│     │  │           │  │  │        ├─ BoothResponse.java
│     │  │           │  │  │        ├─ FiestaResponse.java
│     │  │           │  │  │        └─ RequestStatus.java
│     │  │           │  │  └─ out
│     │  │           │  │     ├─ AWSS3
│     │  │           │  │     │  └─ SaveBoothImgService.java
│     │  │           │  │     └─ persistence
│     │  │           │  │        ├─ BoothEntity.java
│     │  │           │  │        ├─ BoothPersistenceAdapter.java
│     │  │           │  │        └─ BoothRepository.java
│     │  │           │  ├─ application
│     │  │           │  │  ├─ port
│     │  │           │  │  │  ├─ in
│     │  │           │  │  │  │  ├─ ChangeBoothStatusUseCase.java
│     │  │           │  │  │  │  ├─ GetBoothDetailUseCase.java
│     │  │           │  │  │  │  ├─ GetBoothListUseCase.java
│     │  │           │  │  │  │  ├─ GetFiestaListUseCase.java
│     │  │           │  │  │  │  ├─ RegisterBoothCommand.java
│     │  │           │  │  │  │  └─ RegisterBoothUseCase.java
│     │  │           │  │  │  └─ out
│     │  │           │  │  │     ├─ LoadBoothPort.java
│     │  │           │  │  │     ├─ LoadBoothStatusPort.java
│     │  │           │  │  │     ├─ LoadFiestaListPort.java
│     │  │           │  │  │     ├─ SaveBoothCommand.java
│     │  │           │  │  │     ├─ SaveBoothPort.java
│     │  │           │  │  │     └─ SaveImgPort.java
│     │  │           │  │  └─ sevice
│     │  │           │  │     └─ BoothService.java
│     │  │           │  └─ domain
│     │  │           │     ├─ Booth.java
│     │  │           │     ├─ BoothStatus.java
│     │  │           │     ├─ Fiesta.java
│     │  │           │     ├─ Menu.java
│     │  │           │     └─ Owner.java
│     │  │           ├─ common
│     │  │           │  ├─ event
│     │  │           │  │  ├─ Event.java
│     │  │           │  │  ├─ EventConfiguration.java
│     │  │           │  │  └─ Events.java
│     │  │           │  ├─ exception
│     │  │           │  │  ├─ CustomIsPresentException.java
│     │  │           │  │  ├─ CustomNoSuchException.java
│     │  │           │  │  ├─ ErrorCode.java
│     │  │           │  │  ├─ ErrorResponseEntity.java
│     │  │           │  │  └─ GlobalExceptionHandler.java
│     │  │           │  ├─ jpa
│     │  │           │  │  └─ MoneyConverter.java
│     │  │           │  ├─ model
│     │  │           │  │  └─ Money.java
│     │  │           │  ├─ mutipartfile
│     │  │           │  │  └─ MultipartJackson2HttpMessageConverter.java
│     │  │           │  └─ S3
│     │  │           │     ├─ AwsS3Config.java
│     │  │           │     └─ S3Uploader.java
│     │  │           ├─ festival
│     │  │           │  ├─ adapter
│     │  │           │  │  ├─ in
│     │  │           │  │  │  └─ web
│     │  │           │  │  │     ├─ FestivalController.java
│     │  │           │  │  │     └─ model
│     │  │           │  │  │        ├─ FestivalRequest.java
│     │  │           │  │  │        └─ FestivalResponse.java
│     │  │           │  │  └─ out
│     │  │           │  │     ├─ AWSS3
│     │  │           │  │     │  └─ SaveFestivalImgService.java
│     │  │           │  │     └─ persistence
│     │  │           │  │        ├─ FestivalEntity.java
│     │  │           │  │        ├─ FestivalPersistenceAdapter.java
│     │  │           │  │        ├─ FestivalRepository.java
│     │  │           │  │        ├─ MainFestivalProjection.java
│     │  │           │  │        └─ SearchFestivalProjection.java
│     │  │           │  ├─ application
│     │  │           │  │  ├─ port
│     │  │           │  │  │  ├─ in
│     │  │           │  │  │  │  ├─ GetFestivalDetailUseCase.java
│     │  │           │  │  │  │  ├─ GetFestivalIdUseCase.java
│     │  │           │  │  │  │  ├─ GetFestivalsUseCase.java
│     │  │           │  │  │  │  ├─ GetInviteCodeUseCase.java
│     │  │           │  │  │  │  ├─ RegisterFestivalCommand.java
│     │  │           │  │  │  │  └─ RegisterFestivalUseCase.java
│     │  │           │  │  │  └─ out
│     │  │           │  │  │     ├─ LoadFestivalDetailPort.java
│     │  │           │  │  │     ├─ LoadFestivalIdPort.java
│     │  │           │  │  │     ├─ LoadFestivalListPort.java
│     │  │           │  │  │     ├─ LoadInviteCodePort.java
│     │  │           │  │  │     ├─ LoadIsOpenFestivalPort.java
│     │  │           │  │  │     ├─ SaveFestivalCommand.java
│     │  │           │  │  │     ├─ SaveFestivalPort.java
│     │  │           │  │  │     └─ SaveImgPort.java
│     │  │           │  │  └─ service
│     │  │           │  │     └─ FestivalService.java
│     │  │           │  └─ domain
│     │  │           │     ├─ BoothInfo.java
│     │  │           │     ├─ Festival.java
│     │  │           │     ├─ FestivalStatus.java
│     │  │           │     └─ Manager.java
│     │  │           ├─ FestoApplication.java
│     │  │           ├─ global
│     │  │           │  ├─ auth
│     │  │           │  │  ├─ CustomUserDetails.java
│     │  │           │  │  ├─ CustomUserDetailService.java
│     │  │           │  │  ├─ JwtAuthenticationFilter.java
│     │  │           │  │  ├─ JwtExceptionFilter.java
│     │  │           │  │  ├─ JwtUtil.java
│     │  │           │  │  └─ model
│     │  │           │  │     ├─ BaseResponseBody.java
│     │  │           │  │     └─ TokenInfo.java
│     │  │           │  └─ config
│     │  │           │     ├─ SecurityConfig.java
│     │  │           │     └─ WebConfig.java
│     │  │           ├─ member
│     │  │           │  ├─ adapter
│     │  │           │  │  ├─ in
│     │  │           │  │  │  └─ web
│     │  │           │  │  │     ├─ LoginController.java
│     │  │           │  │  │     ├─ MemberController.java
│     │  │           │  │  │     └─ model
│     │  │           │  │  │        ├─ LoginRequest.java
│     │  │           │  │  │        ├─ LoginResponse.java
│     │  │           │  │  │        └─ MemberInfoResponse.java
│     │  │           │  │  └─ out
│     │  │           │  │     └─ persistence
│     │  │           │  │        ├─ MemberPersistenceAdapter.java
│     │  │           │  │        └─ MemberRepository.java
│     │  │           │  ├─ application
│     │  │           │  │  ├─ port
│     │  │           │  │  │  ├─ in
│     │  │           │  │  │  │  ├─ LoginUseCase.java
│     │  │           │  │  │  │  └─ MemberInfoUseCase.java
│     │  │           │  │  │  └─ out
│     │  │           │  │  │     ├─ JoinMemberPort.java
│     │  │           │  │  │     ├─ LoadMemberPort.java
│     │  │           │  │  │     └─ SaveFcmDeviceTokenPort.java
│     │  │           │  │  └─ service
│     │  │           │  │     ├─ LoginService.java
│     │  │           │  │     └─ MemberService.java
│     │  │           │  └─ domain
│     │  │           │     ├─ AuthId.java
│     │  │           │     ├─ Member.java
│     │  │           │     └─ ProfileImageUrl.java
│     │  │           ├─ mock
│     │  │           │  ├─ MenuRequest.java
│     │  │           │  ├─ MockBoothRequest.java
│     │  │           │  ├─ MockDataController.java
│     │  │           │  └─ MockDataRequest.java
│     │  │           ├─ order
│     │  │           │  ├─ adapter
│     │  │           │  │  ├─ in
│     │  │           │  │  │  └─ web
│     │  │           │  │  │     ├─ model
│     │  │           │  │  │     │  ├─ MenuResponse.java
│     │  │           │  │  │     │  ├─ OrderDetailResponse.java
│     │  │           │  │  │     │  ├─ OrderMenu.java
│     │  │           │  │  │     │  ├─ OrderRequest.java
│     │  │           │  │  │     │  ├─ OrderStatusChangeRequest.java
│     │  │           │  │  │     │  ├─ OrderSummaryForBoothOwnerResponse.java
│     │  │           │  │  │     │  ├─ OrderSummaryResponse.java
│     │  │           │  │  │     │  ├─ PaymentInfo.java
│     │  │           │  │  │     │  └─ WaitingCountResponse.java
│     │  │           │  │  │     └─ OrderController.java
│     │  │           │  │  └─ out
│     │  │           │  │     └─ persistence
│     │  │           │  │        ├─ BoothInfoPersistenceAdapter.java
│     │  │           │  │        ├─ FestivalInfoPersistenceAdapter.java
│     │  │           │  │        ├─ MenuPersistenceAdapter.java
│     │  │           │  │        ├─ OrderEntity.java
│     │  │           │  │        ├─ OrderPersistenceAdapter.java
│     │  │           │  │        └─ OrderRepository.java
│     │  │           │  ├─ application
│     │  │           │  │  ├─ port
│     │  │           │  │  │  ├─ in
│     │  │           │  │  │  │  ├─ LoadOrderUseCase.java
│     │  │           │  │  │  │  ├─ OrderStatusChangeUseCase.java
│     │  │           │  │  │  │  └─ PlaceOrderUseCase.java
│     │  │           │  │  │  └─ out
│     │  │           │  │  │     ├─ LoadBoothInfoPort.java
│     │  │           │  │  │     ├─ LoadFestivalInfoPort.java
│     │  │           │  │  │     ├─ LoadMenuPort.java
│     │  │           │  │  │     ├─ LoadOrderPort.java
│     │  │           │  │  │     ├─ PlaceOrderPort.java
│     │  │           │  │  │     └─ UpdateOrderStatusPort.java
│     │  │           │  │  └─ service
│     │  │           │  │     ├─ OrdererService.java
│     │  │           │  │     ├─ OrderService.java
│     │  │           │  │     └─ OrderStatusChangedEventHandler.java
│     │  │           │  └─ domain
│     │  │           │     ├─ BoothInfo.java
│     │  │           │     ├─ FestivalInfo.java
│     │  │           │     ├─ Menu.java
│     │  │           │     ├─ Order.java
│     │  │           │     ├─ Orderer.java
│     │  │           │     ├─ OrderLine.java
│     │  │           │     ├─ OrderNo.java
│     │  │           │     ├─ OrderStatus.java
│     │  │           │     └─ OrderStatusChangedEvent.java
│     │  │           └─ product
│     │  │              ├─ adapter
│     │  │              │  ├─ in
│     │  │              │  │  └─ web
│     │  │              │  │     ├─ model
│     │  │              │  │     │  ├─ ProductRegisterRequest.java
│     │  │              │  │     │  └─ ProductResponse.java
│     │  │              │  │     └─ ProductController.java
│     │  │              │  └─ out
│     │  │              │     ├─ AWSS3
│     │  │              │     │  └─ SaveProductImgService.java
│     │  │              │     └─ persistence
│     │  │              │        ├─ ProductEntity.java
│     │  │              │        ├─ ProductPersistenceAdapter.java
│     │  │              │        └─ ProductRepository.java
│     │  │              ├─ application
│     │  │              │  ├─ port
│     │  │              │  │  ├─ in
│     │  │              │  │  │  ├─ LoadProductUseCase.java
│     │  │              │  │  │  ├─ RegisterProductCommand.java
│     │  │              │  │  │  └─ RegisterProductUseCase.java
│     │  │              │  │  └─ out
│     │  │              │  │     ├─ LoadBoothInfoPort.java
│     │  │              │  │     ├─ LoadProductPort.java
│     │  │              │  │     ├─ SaveImgPort.java
│     │  │              │  │     └─ SaveProductPort.java
│     │  │              │  └─ service
│     │  │              │     └─ ProductService.java
│     │  │              └─ domain
│     │  │                 ├─ BoothInfo.java
│     │  │                 └─ Product.java
│     │  └─ resources
│     │     ├─ application.yml
│     │     ├─ firebase
│     │     │  ├─ fest-o-firebase-adminsdk.json
│     │     │  └─ google-services.json
│     │     ├─ static
│     │     └─ templates
│     └─ test
│        └─ java
│           └─ com
│              └─ example
│                 └─ festo
│                    └─ FestoApplicationTests.java
└─ README.md

```