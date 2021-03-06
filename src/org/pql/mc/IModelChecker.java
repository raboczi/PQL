package org.pql.mc;

import java.util.Collection;
import java.util.Set;

import org.jbpt.petri.IFlow;
import org.jbpt.petri.IMarking;
import org.jbpt.petri.INetSystem;
import org.jbpt.petri.INode;
import org.jbpt.petri.IPlace;
import org.jbpt.petri.ITransition;

/**
 * An interface to a model checker.
 * 
 * @author Artem Polyvyanyy
 */
public interface IModelChecker<F extends IFlow<N>, N extends INode, P extends IPlace, T extends ITransition, M extends IMarking<F,N,P,T>> {
	
	public boolean isLive(INetSystem<F,N,P,T,M> sys, T t);

	public boolean isLive(INetSystem<F,N,P,T,M> sys);

	public boolean isReachable(INetSystem<F,N,P,T,M> sys, Collection<P> marking);

	public boolean isBounded(INetSystem<F,N,P,T,M> sys);
	
	public boolean isBounded(INetSystem<F,N,P,T,M> sys, P p);

	public boolean isSoundWorkflowNet(INetSystem<F,N,P,T,M> sys);
	
	public boolean canReachMarkingWithAtLeastOneTokenAtEachPlace(INetSystem<F,N,P,T,M> sys, Set<P> places);
	
	public boolean isIndexable(INetSystem<F,N,P,T,M> sys);
}
