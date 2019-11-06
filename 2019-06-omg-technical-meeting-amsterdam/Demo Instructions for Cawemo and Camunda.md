[Demo Model Breakdown](https://www.dropbox.com/s/grh78z2md5csz7c/Breakdown%20Travel%20Booking%20with%20Event%20Subprocess.pdf?dl=0)

## Cawemo

- Service Task: Book Flight
- Compensation Event: Flight
- Service Task: Cancel Flight
- save as `Cawemo.bpmn`

![Demo Instructions for Cawemo.png](Demo Instructions for Cawemo.png)

## Camunda Modeler

1. Create a new BPMN file

2. Add an embedded sub-process called:

   - Make Booking

3. Add contents of `Cawemo-ADONIS (pl).bpmn`

4. Add contents of `Trisotech-ITESoft.bpmn`

5. Save as `part2-Camunda.bpmn`

   ![Demo Instructions for Camunda Modeler Alternative.png](Demo Instructions for Camunda Modeler Alternative.png)

   

## Alternative Part for Camunda Modeler

1. Open `BeePMN - Sparx - ARIS - CaseAgile.bpmn`
2. Add an embedded sub-process called:
   - Make Booking
3. Add contents of `Cawemo-ADONIS (pl).bpmn`
4. Add contents of `Trisotech-ITESoft.bpmn`
5. Save as `part-1+2-Camunda.bpmn`

![Demo Instructions for Camunda Modeler.png](/home/falko/omg/bpmn-miwg/bpmn-miwg-demos/2019-06-omg-technical-meeting-amsterdam/Demo%20Instructions%20for%20Camunda%20Modeler.png)



## On the fly checks

`find -iname '*.bpmn' -print0 | xargs -0 -L1 validbpmn`

