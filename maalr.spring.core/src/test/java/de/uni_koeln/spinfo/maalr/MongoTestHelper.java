/*******************************************************************************
 * Copyright 2013 Sprachliche Informationsverarbeitung, University of Cologne
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.uni_koeln.spinfo.maalr;

public class MongoTestHelper {

//	private static Logger logger = LoggerFactory.getLogger(MongoTestHelper.class);
//	private static MongodExecutable mongodExe;
//	private static MongodProcess mongod;
//
//	@BeforeClass
//	public static void startTestMongoDB() throws Exception {
//		if(MongoHelper.isRunning()) {
//			logger.info("MongoDB is already running!");
//			return;
//		}
//		if(mongodExe == null) {
//			logger.info("Starting MongoDB runtime...");
//			MongodStarter runtime = MongodStarter.getDefaultInstance();
//	        mongodExe = runtime.prepare(new MongodConfigBuilder()
//	            .version(Version.Main.PRODUCTION)
//	            .net(new Net(27017, Network.localhostIsIPv6()))
//	            .build());
//	        mongod = mongodExe.start();
//	        mongod.getProcessId();
//		} else {
//			logger.info("Reusing MongoDB runtime...");
//		}
//		
//	}
//
//	@AfterClass
//	public static void stopTestMongoDB() throws Exception {
//		if(mongodExe != null) {
//			logger.info("Shutting down MongoDB...");
//			MongoHelper.shutdown();
//			mongod.stop();
//			mongodExe = null;
//		} else {
//			logger.info("Not shutting down MongoDB");
//		}
//		
//	}

}
