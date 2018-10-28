# Hedera Name Service

HNS is a decentralised solution to address accounts on hashgraph using human readable names

## What is it?

HNS ties your Hedera Identity to a registered .hbar domain. The powerful problem we have solved is enabling simple peer-to-peer payments through vanity dns name service. So you do not need to fill in the Account ID or send any long strings. Usablity is great driver of adoption so we've simplified the process of transacting on Hedera Hashgraph.

## How does it work

  ## Registering a .hbar domain
  
  Once a user verifies the availability of .hbar address they can send payment which sends a transaction to the HNS Account ID. Once the payment is confirmed it returns a reciept to the sending Account ID and registers the DNS record assigning the user Account ID to unique domain submitted.
  
  The Hedera File Storage system retains record that stores the Account ID which made payment and associated .hbar domain. This cost to register a .hbar domain is 42 hbar. The file will auto expire after 365 days unless the timestamp is extended with a new annual payment.
  
  ## How transactions are mapped to Hedera Account IDs
  
  When a payment is sent we map the .hbar address to the registered Account ID. This lookup process makes sending and receving  as simple as sharing an email address to recieve payments at. 

## Getting Started 

### Running examples

## Prerequisites 

## Installing 

